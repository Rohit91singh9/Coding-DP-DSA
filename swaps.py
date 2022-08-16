def swaps(arr, n):
    res = 0
    max_el, min_el = max(arr), min(arr)

    if (min_el == max_el):
        return 0

    index_max, index_min = -1, -1
 
    for i in range(n):
        if arr[i] == max_el and index_max == -1:
            index_max = i
 
        if arr[i] == min_el:
            index_min = i
 
    res += index_min
    res += (n - 1 - index_max)
 
    if index_min > index_max:
        res -= 1
 
    return res

print(swaps([3,2,1], 3))
print(swaps([2,4,3,1,6], 5))
print(swaps([4,11,9,10,12], 5))
