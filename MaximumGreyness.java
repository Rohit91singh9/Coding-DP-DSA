import java.util.Scanner;

public class MaximumGreyness {

    public static int getMaximumGreyness(String[] pixels) {
    	
    	// set maximum greyness of grid to 0
    	int maximumGreyness = 0;
    	
    	// set n to rows of pixels array and m to length of each string of the array i.e number of columns
    	int n = pixels.length, m = pixels[0].length();
    	
    	// loop over the rows of pixels array
    	for(int i=0;i<n;i++)
    	{
    		// loop over the Strings of ith row
    		for(int j=0;j<m;j++)
    		{
    			// set number of white and black values of ith row and jth column to be 0
    			int white = 0, black = 0;
    			
    			// loop to calculate number of white and black values in ith row of grid
    			for(int k=0;k<m;k++)
    			{
    				if(pixels[i].charAt(k) == '0')
    					white++;
    				else
    					black++;
    			}
    			
    			// loop to calculate number of white and black values in jth column of grid
    			for(int k=0;k<n;k++)
    			{
    				if(pixels[k].charAt(j) == '0')
    					white++;
    				else
    					black++;
    			}
    			
    			// compute the greyness value of cell (i,j)
    			int greyness = black - white;
    			
    			// this is first greyness calculated value or calculated greyness value is greater than current maximumGreyness
    			if((i == 0 && j == 0) || (greyness > maximumGreyness))
    				maximumGreyness = greyness; // update maximumGreyness to greyness
    		}
    	}
    	
    	return maximumGreyness;
    }
	
	public static void main(String[] args) {

		// declare variables
		int n;
		String[] pixels;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // read size of the array
		pixels = new String[n]; // create an array of size n to store Strings
		
		// loop to read n Strings and populate the array pixels
		for(int i=0;i<n;i++)
			pixels[i] = sc.next();
		
		// display the value of maximum greyness of pixels array using the method getMaximumGreyness
		System.out.println(getMaximumGreyness(pixels));
	}

}

