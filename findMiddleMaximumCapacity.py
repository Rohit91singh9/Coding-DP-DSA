def findMiddleMaximumCapacity(capacity):
    max = 0
    for i in range(0, n - 2):
        for j in range(i + 1, n - 1):
            for k in range(j + 1, n):
                if capacity[j] % capacity[i] == 0 and capacity[k] % capacity[j] == 0:
                    if max < capacity[j]:
                        max = capacity[j]
                    # returning maximum value
                    return max
                return -1
# taking n input
n = int(input())
# taking capacity input
capacity = list(map(int, input().split(",")))
# function calling
res = findMiddleMaximumCapacity(capacity)
print(res)


# If any testcases fail let me know i will update as per the suitable approach.


# This is complete logic of a Program in Python.
# Remaining codes are in-built.

# NOTE_

#    I completed this Assessment during Amazon Hackerrank 1st Round. 

#   If you can figure out any other Approach to solve this problem, feel free to share me the code 
#   which will help other candidates
#   I would love to hear from you if you've cracked the Interview.
#   beingactual@gmail.com
