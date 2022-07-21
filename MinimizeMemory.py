def minimizeMemory(processes, m):
        n=len(processes)
        if(n < m):
            return -1
        res = 0
        for i in range(m):
            res +=processes[i] 
        curr_sum = res
        for i in range(m,n):
                curr_sum +=processes[i] - processes[i-m]
                res = max(res,curr_sum)

       
# This is complete logic of a Program
# Remaining codes are in-built

""""
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
"""

