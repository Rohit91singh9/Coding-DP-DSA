// Approach 1
class findNumWaysToSplit {
    public static int solve(String s, int k) {
        int[] prefix = new int[26];
        int[] suffix = new int[26];
        for(char c : s.toCharArray()) {
            suffix[c-'a']+=1;
        }
        int categories = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int idx = cur - 'a';
            suffix[idx]--;
            prefix[idx]++;
            if(suffix[idx] > 0 && prefix[idx] > 0) {
                categories++;
            } else {
                categories--;
            }
            if(categories>k) ans++;
        }
        return ans;
    }
}


// Approach 2

private static int findNumWaysToSplit(String categories, int k) {
    Map<Character, Integer> charToFreq = new HashMap<>(); {
    for (char c : categories.toCharArray()) {
        charToFreq.put(c, charToFreq.getOrDefault(c, 0) + 1);
    }
    int n = categories.length();
    Map<Character, Integer> prefixMapItems = new HashMap<>();
    int numWaysToSplit = 0;
    int numSharedChar = 0;
    for (int i = 0; i < n; i++) {
        char currChar = categories.charAt(i);
        int freqLeftSide = prefixMapItems.getOrDefault(currChar, 0) + 1;
        int freqRightSide = charToFreq.get(currChar) - freqLeftSide;
        if (freqLeftSide != 0 && freqRightSide != 0 && !prefixMapItems.containsKey(currChar)) {
            numSharedChar += 1;
        } else if (freqRightSide == 0) {
            numSharedChar -= 1;
        }
        if (numSharedChar > k) numWaysToSplit++;
        prefixMapItems.put(currChar, prefixMapItems.getOrDefault(currChar, 0) + 1);
    }
    return numWaysToSplit;
}
}


/* 
An easy approach to this problem is to create prefix and suffix arrays and store all the unique characters seen till now in the prefix and suffix respectively. Then for every index 'i', use a hashset or frequency array to find the count of common characters in the prefix[i] and suffix[i] respectively. If this count is greater than 'k', then this is a valid partition. So, increment the count of partitions.

Why this works?

Notice that your input length can be 10^5 so an O(N^2) solution will not work. However, when we just store the unique characters in prefix and suffix, we ensure that even in the worst case, the count of characters from prefix[i] and suffix[i] will never exceed 26 which can be treated as negligible as compared to 10^5. Hence, the overall complexity will be:

Computing Prefix array: O(N)
Computing Suffix array: O(N)
Finding Common Characters for each prefix[i] and suffix[i]: O(N * 26) = O(N)

Hence, overall TC = O(N) + O(N) + O(N) = O(N)
*/

/*
 If any testcases fail let me know i will update as per the suitable approach


# This is complete logic of a Program in Python
# Remaining codes are in-built

# NOTE_

#    I completed this Assessment during Amazon Hackerrank 1st Round 

#   If you can figure out any other Approach to solve this problem, feel free to share me the code 
#   which will help other candidates
#   I would love to hear from you if you've cracked the Interview.
#   beingactual@gmail.com

*/
