// Approach 1

import java.util.Arrays;

public class minimumKeypad {
    public static void main(String[] args) {
        String str = "abcghdiefjoba";
        int[] countocc = new int[26];
        for (char c : str.toCharArray()) {
            countocc[c - 'a']++;
        }
        Arrays.sort(countocc);
        int res = 0, clicks = 1, numsused = 0;
        for (int i = 25; i >= 0; i--) {
            if (countocc[i] == 0)
                continue;
            res += countocc[i] * clicks;
            numsused++;
            if (numsused == 9) {
                numsused = 0;
                clicks++;
            }
        }
        System.out.println(res);
    }
}


// Approach 2
/* 
public int minimumKeyClicks(String s) {
    int[] cnts = new int[26];
    for(char c : s.toCharArray()) {
     cnts[c-'a']++;
    }
    Arrays.sort(cnts);
    int ans = 0, clickMultiplier = 1, numPadUsed= 0;
    for(int i=25; i>=0; i--) {
     if(cnts[i]==0) continue;
     ans+=clickMultiplier*cnts[i];
     numPadUsed++;
        if(numPadUsed==9) {
        numPadUsed = 0;
        clickMultiplier++;
        }
    }
    return ans;
}
*/