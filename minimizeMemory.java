// Approach 1

import java.util.*;
public class Main
{
 public static void main(String[] args) {
  List<Integer> list = new ArrayList<>();
  list.add(10);
  list.add(4);
  list.add(8);
  list.add(1);
  
  System.out.println(minimizeMemory(list,2));
 }
	
 public static int minimizeMemory(List<Integer> processes, int m){
     int n = processes.size();
     if(n<m){
         return -1;
     }
     
     int out = 0;
     for(int i=0; i<m; i++){
         out += processes.get(i);
     }
     
     int curr_sum = out;
     for(int i=m; i<n; i++){
         curr_sum += processes.get(i) - processes.get(i-m);
         out = Math.max(out,curr_sum);
     }
     
     int sum = 0;
     for(int i=0; i<n; i++){
         sum += processes.get(i);
     }
     return sum-out;
 }
}
