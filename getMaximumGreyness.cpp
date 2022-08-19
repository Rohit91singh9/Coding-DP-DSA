// Approach 1:

#include <iostream>
#include <vector>
#include <string>
using namespace std;

// getMaximumGreyness() function returns the maximum greyness value
int getMaximumGreyness(string pixels[], int n) {
    
    // taking the size of the number of characters in the 0th row
    int m = pixels[0].size();

    // declaring vector of pair to store the count of zeroes and ones in row-wise fashion
    vector<pair<int, int> > storeZeroOne1;
    // declaring vector of pair to store the count of zeroes and ones in column-wise fashion
    vector<pair<int, int> > storeZeroOne2;

    //one’s variable counts the number of ones
    int ones = 0;
    // zeroes variable counts the number of zeroes
    int zeroes = 0;

    // traversing the grid in row-wise fashion
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            // checking if grid value is equal to 1
            if(pixels[i][j] == '1') {
                // incrementing the number of ones
                ones++;
            } else {
                // incrementing number of zeroes
                zeroes++;
            }
        }
        // inserting the number of ones and number of zeroes in the first vector
        storeZeroOne1.push_back(make_pair(ones, zeroes));
        // resetting ones variable
        ones = 0;
        // resetting zeroes variable
        zeroes = 0;
    }

    // resetting ones and zeroes variable
    ones = zeroes = 0;

    // traversing the grid in column wise fashion
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            // checking if grid value is equal to 1
            if(pixels[j][i] == '1') {
                // incrementing the number of ones
                ones++;
            } else {
                // incrementing number of zeroes
                zeroes++;
            }
        }
        // inserting the number of ones and number of zeroes in the second vector
        storeZeroOne2.push_back(make_pair(ones, zeroes));
        // resetting ones variable
        ones = 0;
        // resetting zeroes variable
        zeroes = 0;
    }

    // answer variable will store the maximum greyness value
    int answer = 0;

    // traversing in the vector
    for(int i = 0; i < storeZeroOne1.size(); i++) {
        // calculating the current answer
        int currentAnswer = (storeZeroOne1[i].first + storeZeroOne2[i].first) - (storeZeroOne1[i].second + storeZeroOne2[i].second);
        // updating the answer
        answer = max(answer, currentAnswer);
    }

    cout << "The maximum achievable greyness is: ";
    // Finally return the maximum greyness value
    return answer;
}

// main function
int main() {
    
    // pixels declaration
    string pixels[3] = {"101", "001", "110"};

    // taking the size of the pixels
    int n = sizeof(pixels) / sizeof(pixels[0]);

    // taking the size of the number of characters in the 0th row
    int m = pixels[0].size();

    cout << "Given Matrix: " << endl;
    // printing the given matrix
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            cout << pixels[i][j] << " ";
        }
        cout << endl;
    }

    // calling getMaximumGreyness() function to find the maximum greyness value
    cout << getMaximumGreyness(pixels, n) << endl;

    return 0;
}



// Approach 2:

#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    vector<string> pixels;
    for (int i = 0; i < n; i++)
    {
        string s;
        cin >> s;
        pixels.push_back(s);
    }
    int m = pixels[0].size();
    int row1[n];
    int col1[m];
    int cnt = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (pixels[i][j] == '1')
                cnt++;
        }
        row1[i] = cnt;
        cnt = 0;
    }
    for (int j = 0; j < m; j++)
    {
        for (int i = 0; i < n; i++)
        {
            if (pixels[i][j] == '1')
                cnt++;
        }
        col1[j] = cnt;
        cnt = 0;
    }
    int mx = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            int d = (2 * (row1[i] + col1[j])) - m - n;
            mx = max(mx, d);
            cout << d << " ";
        }
        cout << endl;
    }
    cout << "Maximum Greyness: " << mx;
    cout << endl;
}
