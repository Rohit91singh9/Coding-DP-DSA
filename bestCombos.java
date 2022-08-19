// Approach 1

import java.util.*;
class bestCombos {
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
      
       int n=sc.nextInt();
      
       int popularity[]=new int[n];
       //input the array
       for(int i=0;i<n;i++)
           popularity[i]=sc.nextInt();
      
       int k=sc.nextInt();
      
       int combo[]=bestCombo(popularity,k);
      
       for(int i=0;i<combo.length;i++)
           System.out.println(combo[i]);
      
   }
  
   public static int[] bestCombo(int popularity[],int k)
   {
       ArrayList<Integer> combo=new ArrayList<Integer>();
       int sum=0;
       combo.add(0);
       //compute all the combinations
       for(long i=1;i<Math.pow(2,popularity.length);i++)
       {
           sum=0;
           for(int j=0;j<popularity.length;j++)
           {
               if((i&(long)Math.pow(2,j))>0)
               {
                   sum+=popularity[j];
               }
           }
           combo.add(sum);
       }
      
       //sort the list
       Collections.sort(combo);
      
       //create the final output array
       int output[]=new int[k];
      
       int index=0;
      
       for(int i=combo.size()-1;i>=0;i--)
       {
           output[index++]=combo.get(i);
           if(index==k)
               break;
       }
  
       return output;
   }
}
