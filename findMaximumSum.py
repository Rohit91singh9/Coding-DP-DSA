# 1st Approach:

def findMaximumSum(stockPrice, k):
    # Write your code here
    suml=[]
    for i in range(0,len(stockPrice)-k):
        if(len(set(stockPrice[i:i+k]))==k):
            suml.append(sum(stockPrice[i:i+k]))
        
    if len(suml) == 0;
        return -1
        else:
            return max(suml)
        
# 2nd Approach    

def findMaximumSum(stockPrice, k):
    # Write your code here
    sumstockprice=[]
    for i in range(0,len(stockPrice)-k):
        if(len(set(stockPrice[i:i+k]))==k):
            sumstockprice.append(sum(stockPrice[i:i+k]))
        
    if(len(sumstockprice) == 0;
        return -1
        else:
           return max(sumstockprice)


# 3nd Approach:

def findMaximumSum(l,k):
    suml=[]
    for i in range(0,len(l)-k):
        if(len(set(l[i:i+k]))==k):
            suml.append(sum(l[i:i+k]))
    return max(suml)

l=[1,2,7,7,4,3,6]
k=3
Res=findMaximumSum(l,k)
print(Res)


""" NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    feel free to share me the Code which will help other candidates.
    I would love to hear from you on the Mail ID I have Provided. 
    if you've cracked the Interview.

    beingactual@gmail.com

"""
