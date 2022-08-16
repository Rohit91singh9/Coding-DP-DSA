#include <iostream>
using namespace std;
//function
int getMinMoves(int arr[], int n)
{
    int i, j, k = 0;
    //starting nested loop here
    for (i = 0; i < n - 1; i++)
        for (j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
    //printing Correct Order            
    cout<<"Correct Order: ";
    for (k= 0; k < n; k++) //for loop
        cout << arr[k] << " ";
    cout << endl;
    return 0;
}
int main()
{
    int plates[5] = {4, 6, 3, 2, 5};
    //calling function
    getMinMoves(plates, 5);
    return 0;
}


// This is complete logic of a Program

/*
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem,
    You can share me the code which will help other Candidates. 
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
*/
