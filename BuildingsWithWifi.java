import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    //  Create router class for easy reference to location and range
    public static class Router {
        int location;
        int range;

        Router(int location, int range) {
            this.location = location;
            this.range = range;
        }
    }

    public int getServedBuildings(List<Integer> buildingCount, List<Integer> routerLocation, List<Integer> routerRange) {
        Integer[] buildingsServedArray = buildingCount.toArray(new Integer[0]);
        List<Router> routers = new ArrayList<>();
        int buildingsServed = 0;

        //  Loop and add location and range to routers list - (subtract 1 from location for 0 indexing)
        for(int i = 0 ; i < routerLocation.size() ; i++) {
            routers.add(new Router((routerLocation.get(i) - 1), routerRange.get(i)));
        }
        //  Loop over routers
        for(Router i : routers) {
            //  Check if router location minus range is in bounds (greater than or equal to 0) - set index
            int index = Math.max(i.location - i.range, 0);
            //  While index is in bounds and less than router location plus router range
            while(index < buildingsServedArray.length && index <= i.location + i.range) {
                //  Subtract 1 from each building in range
                buildingsServedArray[index] -= 1;
                //  Increment index
                index++;
            }
        }
        //  Loop buildings served array
        for(int i : buildingsServedArray) {
            //  If the building has a value of 0 or less, it has been served
            if(i <= 0) {
                //  Count
                buildingsServed++;
            }
        }
        //  Return total buildings served
        return buildingsServed;
    }

}


public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        int buildingCountCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> buildingCount = IntStream.range(0, buildingCountCount).mapToObj(i -> {
            
    try {
        return bufferedReader.readLine().replaceAll("\\s+$", "");
        } 
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    })
.map(String::trim)
.map(Integer::parseInt)
.collect(toList());

int routerLocationCount = Integer.parseInt (bufferedReader.readLine() .trim());


List<Integer> routerLocation = IntStream.range(0, routerLocationCount).mapToObj(i -> {

try {
return bufferedReader.readLine().replaceAll("\\s+$", "");
} 
catch (IOException ex) {
    throw new RuntimeException(ex) ;
}

})
.map(String::trim)
.map(Integer::parseInt)
.collect(toList());

int routerRangeCount = Integer.parseInt (bufferedReader.readLine().trim());

List<Integer> routerRange = IntStream.range(0, routerRangeCount).mapToObj (i -> {

    try {
        return bufferedReader.readLine().replaceAll("\\s+$", "");
    } 
        catch (IOException ex) {
            throw new RuntimeException(ex);
    }
})

.map(String::trim)
.map(Integer::parseInt)
.collect(toList());

int result = Result.getServedBuildings(buildingCount, routerLocation, routerRange);

bufferedWriter.write(String.valueOf(result));
bufferedWriter.newLine();

bufferedReader.close();
bufferedWriter.close();

}
}


/*  1st Approach
=================================================================================================================================================
    Buildings with Wifi - Takes in three lists and finds if all buildings are served -
    A building is considered served when the number of routers supporting the building is equal to or greater than the head count of the building
        'buildingCount' is a head count per building (each value represents a building) -
        'routerLocation' is the building number where a router is located (buildings numbered ascending from 1)
        'routerRange' is connected by index to routerLocation and represents the range of the router (location + & - range ---- inclusive)
    Return the number of served buildings
     */

    /* NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com

    */


/* 2nd Approach CODE:
=====================================================================================================================

 static int getServedBuilding(int[] buildingCount, int[] routeLocation, int[] routerRange){
        int res=0;
        for(int i=0;i<routeLocation.length;i++)
        {int building=routeLocation[i];
        int rangeLeftIndex=building-routerRange[i];
        int rangeRightIndex=building+routerRange[i];
        for(int j=rangeLeftIndex;j<rangeRightIndex;j++)
        {
        if(j>0){
        buildingCount[j-1]--;
        }
        }}
        for(int i=0;i<buildingCount.length;i++)
        {if(buildingCount[i]<=0)
        {res++;}}
        return res;
        
        }
 */
    