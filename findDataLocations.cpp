class Solution {
public:
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

/* NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    feel free to share me the Code which will help other candidate.
    I would love to hear from you on the Mail ID I have Provided. 
    if you've cracked the Interview.

    beingactual@gmail.com
*/

