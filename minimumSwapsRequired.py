
def minimumSwapsRequired(string):
    n = len(string)
    num = 0 
    for i in range(n // 2):
        if string[i] != string[n - i - 1]:
            num += 1
    if num % 2 == 1 and n % 2 == 0:
        return -1
    return (num + 1) // 2   
    
print(minimumSwapsRequired("101000"))


# This is complete logic of a Program
# Remaining codes are in-built

# NOTE:

#    I completed this Assessment during Amazon Hackerrank 1st Round 

#   If you can figure out any other Approach to solve this problem, 
#   I would love to hear from you if you've cracked the Interview.
#   beingactual@gmail.com
