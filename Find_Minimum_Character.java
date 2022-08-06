/* 1st Approach */

import java.util.*;  
class Result { 	 	
    public static int findMinimumCharacters(String searchWord, String resultWord) { 
        // Write your code here
        		
        int p = 0; 		
        int q = 0; 		
        while(p < searchWord.length()) 		
        { 			
            if(searchWord.charAt(p) == resultWord.charAt(q)) 			
            { 				
                q += 1; 				
                if(q == resultWord.length()) 				
                { 					
                    return 0; 				
                } 			
            } 			p += 1; 		
        } 		return (resultWord.length() - q); 	
    }  	
    public static void main(String[] args) throws Exception 	
    { 		
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Search Word"); 		
            String str1 = sc.nextLine(); 		
            System.out.println("Enter Result Word"); 		
            String str2 = sc.nextLine(); 		
            System.out.println(findMinimumCharacters(str1, str2));
        	
    } 
} 

/* 2nd Approach */

import java.util.*;  
class find { 	 	
    public static int findMinimumCharacters(String searchWord, String resultWord) 	
    { 		
        int p = 0; 		
        int q = 0; 		
        while(p < searchWord.length()) 		
        { 			
            if(searchWord.charAt(p) == resultWord.charAt(q)) 			
            { 				
                q += 1; 				
                if(q == resultWord.length()) 				
                { 					
                    return 0; 				
                } 			
            } 			p += 1; 		
        } 		return (resultWord.length() - q); 	
    }  	
    public static void main(String[] args) throws Exception 	
    { 		
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Search Word"); 		
            String str1 = sc.nextLine(); 		
            System.out.println("Enter Result Word"); 		
            String str2 = sc.nextLine(); 		
            System.out.println(findMinimumCharacters(str1, str2));
        } 	
    } 
} 

/* 
    This is complete logic of a Program
    Remaining codes are in-built


NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    You can share me the code which will help other Candidates.
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
*/
