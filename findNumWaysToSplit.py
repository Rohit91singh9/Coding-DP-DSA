# Approach 1
str=input()
k=int(input())
c1=0
for i in range(len(str)-1):
    c=0
    s=""
    s1=str[:i+1]
    s2=str[i+1:]
    for i in s1:
        if i in s2 and i not in s:
            c+=1
        s+=i
    if(c>k):
        c1+=1
print(c1)

# Approach 2
def noofsplits(s,k):
    c = 0
    for i in range(1,len(s)):
        split1 = set(s[:i])
        split2 = set(s[i:])
        if len(split1.intersection(split2))>k:
            c+=1
            print(s[:i],s[i:])
        return c
s = "abbcac"
k= 1
print(noofsplits(s,k))

# Approach 3
class Solution:
    def numSplits(self, s: str, k: int) -> int:
        def countSharedChars(arr1, arr2):
            ans = 0
            for i in range(26):
                if arr1[i] > 0 and arr2[i] > 0:
                    ans += 1
            return ans
        
        def pos(char):
            return ord(char) - ord('a')
           
        left = [0] * 26
        right = [0] * 26
        for char in s:
            right[pos(char)] += 1
        
        ans = 0
        for char in s:
            left[pos(char)] += 1
            right[pos(char)] -= 1
            numSharedCate = countSharedChars(left, right)
            if numSharedCate > k:
                ans += 1
                
        return ans
    
obj = Solution()
s = 'abbcac'
k = 1
print(obj.numSplits(s, k))

s = 'adbccdbada'
k = 2
print(obj.numSplits(s, k))

s = 'wxyzzyxw'
k = 1
print(obj.numSplits(s, k))

"""
An easy approach to this problem is to create prefix and suffix arrays and store all the unique characters seen till now in the prefix and suffix respectively. Then for every index 'i', use a hashset or frequency array to find the count of common characters in the prefix[i] and suffix[i] respectively. If this count is greater than 'k', then this is a valid partition. So, increment the count of partitions.

Why this works?

Notice that your input length can be 10^5 so an O(N^2) solution will not work. However, when we just store the unique characters in prefix and suffix, we ensure that even in the worst case, the count of characters from prefix[i] and suffix[i] will never exceed 26 which can be treated as negligible as compared to 10^5. Hence, the overall complexity will be:

Computing Prefix array: O(N)
Computing Suffix array: O(N)
Finding Common Characters for each prefix[i] and suffix[i]: O(N * 26) = O(N)

Hence, overall TC = O(N) + O(N) + O(N) = O(N)
"""
# This is complete logic of a Program
# Remaining codes are in-built

"""
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    I would love to hear from you if you've cracked the Interview.
"""
    # beingactual@gmail.com

