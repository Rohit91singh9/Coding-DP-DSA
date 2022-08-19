// Approach 1:

vector<int> findSongs(int rideDuration, vector<int> a) {
    if(rideDuration < 30)  return {-1,-1};
    int x = rideDuration - 30;
    vector<int>res(2);
    res[0]=-1;
    res[1]=-1;
    int ma = INT_MIN;
    map<int,int>m;
    for(int i=0;i<a.size();i++){
        if(m.count(x-a[i]) && i!= m[x-a[i]] &&(ma < max(a[i],x-a[i])) ){
            res[0] = m[x-a[i]];
            res[1] = i;
            ma = max(a[i],x-a[i]);
        }
        m[a[i]]=i;
    }
    return res;
}


// Approach 2:

vector<int> findSongs(int rideDuration, vector<int> songDurations) {
    int left,right, firstIndex = -1, lastIndex = -1;
    left = 0;
    right = songDurations.size() - 1;
    vector <vector<int>> map;
    for(int i=0; i<=right; i++)
        map.push_back({songDurations[i], i});
    sort(map.begin(), map.end());
    while(left<right)
    {
        int num = map[left][0] + map[right][0] + 30;
        if( num == rideDuration)
        {
            firstIndex = map[left][1];
            lastIndex = map[right][1];
            break;
        }
        else if(num > rideDuration)
            right--;
        else if (num < rideDuration)
            left++;   
    }
    if(firstIndex > lastIndex)
        swap(firstIndex, lastIndex);
    vector <int> ans{firstIndex, lastIndex};
    return ans;
}
