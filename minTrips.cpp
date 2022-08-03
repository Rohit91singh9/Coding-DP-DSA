#include<bits/stdc++.h>
using namespace std;

int trips(vector<int> &weights){
    // initialize the variables and map to store frequencies of weights
    int size = weights.size();
    int numTrips = 0;
    map<int, int> freq;

    // store the frequencies of weights in the map
    for(auto it : weights){
        freq[it]++;
    }

    // iterate through the map and find the number of trips
    for(auto elem : freq){
        int it = elem.second;
        
        // if frequency is 1, then we cannot make any trips
        if(it == 1) return -1;
        
        // if frequency is multiple of 3, we can directly deliver it
        if(it % 3 == 0){
            numTrips += it / 3;
        }

        // if remainder is 2, we can make another trip with 2 of such elements
        else if(it % 3 == 2){
            numTrips += (it - 2) / 3 + 1;
        }

        // if remainder is 1, we can just remove 1 trip of 3, and in return make two trips of 2
        else{
            numTrips += (it - 1) / 3 + 1;
        }
    }

    return numTrips;
}

int main(){
    vector<int> weights = {2, 4, 6, 6, 4, 2, 4};
    cout << trips(weights);
    return 0;
}
