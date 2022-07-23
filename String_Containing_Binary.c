#include<stdio.h>

#include<string.h>

#include<math.h>

//function that takes in String and returns an int

int solution(char *S) {

   //we store the length of string S in N

   int N=strlen(S);

   int count=0, number=0,bit=0,j=0;

   //traversing S from the end

   for(int i=N-1;i>=0;i--) {

       //convert S[i] to integer

       bit=S[i]-'0';

       //converting binary to decimal form

       number = number + (pow(2,j) * bit);

       //increasing power of 2 as we move from right to left

       j++;

   }

   //while the number is greater than 0

   while(number>0) {

       //if number is even

       if(number%2==0) {

           //divide it by 2

           number=number/2;

       }

       //if number is odd

       else

           //decrement it by 1

           number = number -1;

       //increment count in every iteration

       count++;

   }

   //returning count

   return count;

}

//main method for testing

int main() {

   //calling above function with a sample string of decimal value 28

   printf("%d",solution("011100"));

}



// OUTPUT
// 7 Process exited after 8.975 seconds with return value 0.
// ...Program finished with exit code 0



/*Explaination 

 Importing the string and math modules to use strlen() and pow()
   count is used to count the number of operation to make the number 0
   Number stores the decimal eqquivalent of given binary
   bit is used to the numerical form of each bit in string
   j is used to increase the power of 2 for binary to decimal conversion

*/

/* NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    feel free to share me the Code which will help other candidate.
    I would love to hear from you on the Mail ID I have Provided. 
    if you've cracked the Interview.

    beingactual@gmail.com

*/
