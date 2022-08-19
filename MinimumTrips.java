// Approach 1

    public static int getMinimumTrips(List<Integer> weights)
    {
        int size = weights.size();
        int minTrips = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : weights)
        {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> elem : freq.entrySet())
        {
            int i = elem.getValue();
            if (i == 1)
                return -1;
            if (i % 3 == 0)
            {
                minTrips += i / 3;
            }
            else if (i % 3 == 2)
            {
                minTrips += (i - 2) / 3 + 1;
            }
            else
            {
                minTrips += (i - 1) / 3 + 1;
            }
        }
        return minTrips;
    }
}
// please define the main method


// Approach 2

public static int getMinimumTrips(List<Integer> weights) {

    Map<Integer,Integer> map = new HashMap<>();

    for(int i : weights) {

        map.put(i,map.getOrDefault(i,0)+1);
    }

    int cnt = 0;

    for(int i : map.values()) {
        if(i == 1) return -1;
        else if(i == 2) cnt += 1;
        else if(i%3 == 0) cnt += i/3;
        else if((i+1)%3 == 0) cnt += (i+1)/3;
        else if((i-1)%3 == 0) cnt += ((i-1)/3)+1;
    }

    return cnt;
}


// Approach 3

int n = weights.size();
map<int,int> m;

for(auto x:weights)
        m[x]++;

    int res = 0;
    for(auto x:m){

        int cnt = x.second;
        if(cnt == 1)
            return -1;

        res+=(cnt/3 + (cnt%3!=0));

    }

    return res;

