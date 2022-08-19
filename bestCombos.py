# Approach 1

from ast import List
from collections import deque
from heapq import heappop, heappush


def run(arr: List[int], k: int) -> List[int]:
    min_heap = [0]
    stack = deque()
    
    # Add each value to stack
    for i, x in enumerate(arr):
        stack.append((arr[i], arr[i+1:]))
    
    # DFS
    while stack:
        popularity, remaining = stack.pop()
        
        # Add popularity and maintain heap of size k
        heappush(min_heap, popularity)
        if len(min_heap) > k:
            heappop(min_heap)
        
        # Iterate over remaining array
        for i, x in enumerate(remaining):
            stack.append(((popularity + x), remaining[i+1:]))
    
    return min_heap

    

# This is complete logic of a Program
# Remaining codes are in-built

#
# NOTE_:

#    I completed this Assessment during Amazon Hackerrank 1st Round 

#    If you can figure out any other Approach to solve this problem,
#    You can share me the code which will help other Candidates. 
#    I would love to hear from you if you've cracked the Interview.
#    beingactual@gmail.com
