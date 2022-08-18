def makePowerNonDecreasing(arr):
    d=0
    for i in range(0,len(arr)-1):
        a=arr[i]
        b= arr[i+1]
        
        if a<=b:
            pass
        else:
            c = a-b
            d+=c
    return d

    
n= int(input())    
power = list(map(int , input().split()))

res = makePowerNonDecreasing(power)
print(res)
