def password(word):
  vowel=0
  consonent=0
  res=0
  for l in word:
    if l=='a' or l=='e' or l=='i' or l=='o' or l=='u':
      vowel+=1
    else:
      consonent+=1
    if vowel>=1 and consonent>=1:
      res+=1
      vowel=0
      consonent=0
  return res

word='thisisbeautiful'
word1='hackerrank'
word2='aeiou'
print(password(word))
print(password(word1))
print(password(word2))




"""
Approach in JAVA:
=================

public int passwordStrength(String s) {
		int i=0; int j=0;
		int v = 0; int c = 0;
		int total = 0;
		while(j < s.length() && i<=j) {
			if(v>=1 && c>=1) {
				total += 1;
				i = j;
				v=0; c=0;
			}
			if(isVowel(s.charAt(j))) {
				v++;
			}
			else {
				c++;
			}
			j++;
		}
		
		if(v>=1 && c>= 1){
			total += 1;
		}
		return total;
	}
	
	public boolean isVowel(char ch) {
		return ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u';
	}
"""

# This is complete logic of a Program
# Remaining codes are in-built

"""
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
"""