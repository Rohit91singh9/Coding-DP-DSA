/* Approach 1 */

class Solution {
public:
// Write your code here
vector<int> findDataLocations(vector<int> locations, vector<int> movedFrom, vector<int> movedTo) {
    set <int> ans; 
    for(int x:locations) ans.insert(x); 
    for(int i=0;i<movedFrom.size();i++){ 
        if(movedFrom[i]!=movedTo[i]){ 
            ans.erase((movedFrom[i])); 
            ans.insert(movedTo[i]); 
        }
    } 
    vector<int> a; 
    for(int i:ans){
        a.push_back(i);
    }
    return a; 
}
// int main()
    
/* Approach 2 */

#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    int m;
    cin >> m;
    int from[m], to[m];
    for (int i = 0; i < m; i++)
        cin >> from[i];

    for (int i = 0; i < m; i++)
        cin >> to[i];

    map<int, int> mp;
    for (int i = 0; i < n; i++)
    {
        mp[arr[i]] = 1;
    }

    for (int i = 0; i < m; i++)
    {
        if (mp.find(from[i]) != mp.end())
        {
            mp[from[i]] = 0;
        }
        mp[to[i]] = 1;
    }
    for (auto x : mp)
    {
        if (x.second == 1)
            cout << x.first << " ";
    }
    cout << endl;
}

/* Approach 3 */

int n, m; 
int findDataLocations(int locations[], int movedFrom[], movedTo[]) 
{ 
    unordered_map<int, int> mp; 
    for (int i = 0; i < m; i++) 
    { 

        mp[movedFrom[i]] movedTo[i]; 

    }

    for (int i = 0; i < n; i++) 
    { 

        if (mp.find(locations[i]) != mp.end() and mp[locations[i]] != -1) 
        { 
            
            int tar = mp[locations[i]]; 
            
            mp[locations[i]] = -1; 

            while (mp.find(tar) != mp.end() and mp[tar] != -1) 
            { 
                tar = mp[tar]; 
                
                mp[tar] = -1;
            }

            locations[i] = tar; 
        }

    }        
    
    sort(locations, locations + n); 
    for (int i = 0; i < n; i++) 
    {
        return locations[i];
    }
}


/* NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    feel free to share me the Code which will help other candidate.
    I would love to hear from you on the Mail ID I have Provided. 
    if you've cracked the Interview.

    beingactual@gmail.com
*/

