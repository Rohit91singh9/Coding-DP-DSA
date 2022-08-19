// Approach 1

#include <bits/stdc++.h>
using namespace std;

vector<long> bestCombo(vector<int> popularity, int k) {
    long posTotal = 0;
    vector<long> ans, out;
    for(int p: popularity) {
        if(p > 0)
            posTotal += p;
    }

    for(int& p: popularity) {
        p = abs(p);
    }
    sort(popularity.begin(), popularity.end());

    priority_queue<array<int, 2>, vector<array<int, 2>>, greater<array<int, 2>>> pq;
    int n = popularity.size();
    pq.push({popularity[0], 0});
    while(pq.size() && out.size() < k - 1) {
        auto s = pq.top();
        int u = s[0], i = s[1];
        pq.pop();
        out.push_back(u);
        if(i + 1 < n) {
            pq.push({u+popularity[i+1],i+1});
            pq.push({(u-popularity[i])+popularity[i+1],i+1});
        }
    }

    ans.push_back(posTotal);
    for(int o: out) {
        ans.push_back(posTotal - o);
    }

    return ans;
}

int main() {
    int n, k;
    cin >> n;
    vector<int> p(n);
    for(int&i : p) cin >> i;
    cin >> k;

    auto b = bestCombo(p, k);
    for(int i: b)
        cout << i << " ";
    return 0;
}
