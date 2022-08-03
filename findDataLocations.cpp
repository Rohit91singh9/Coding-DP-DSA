/* 1st Approach */

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


/* 2nd Approach */

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

