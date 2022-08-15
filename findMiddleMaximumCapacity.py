# APPROACH 1

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


# APPROACH 2

def findMiddleMaximumCapacity(arr):    
    output = -1
    arr = sorted(list(enumerate(arr)), key=lambda pair: pair[1])

    for end in range(len(arr)-1, -1, -1):
        for middle in range(end-1, -1, -1):
            if arr[end][1] % arr[middle][1] == 0:
                for begin in range(middle-1, -1, -1):
                    if arr[middle][1] % arr[begin][1] == 0 and arr[end][0] > arr[middle][0] > arr[begin][0]:
                        return arr[middle][1]
    return output


# If any testcases fail let me know i will update as per the suitable approach.


# This is complete logic of a Program in Python.
# Remaining codes are in-built.

# NOTE_

#    I completed this Assessment during Amazon Hackerrank 1st Round. 

#   If you can figure out any other Approach to solve this problem, feel free to share me the code 
#   which will help other candidates
#   I would love to hear from you if you've cracked the Interview.
#   beingactual@gmail.com
