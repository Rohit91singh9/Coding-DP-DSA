# 1st Approach

def findMaximumSum(stock,k): 
    sum,m,x=0,0,1 
    for i in range(len(stock)-k+1): 
        a=stock[i:i+k] 
        x=1 
        sum=0 
        for j in a: 
            if(a.count(j)>1): 
                x=0 
                break 
            else: 
                sum+=j 
        if(x==1 and m<sum): 
            m=sum 
    if(m==0): 
        return -1 
    else: 
        return m 
print("Enter the stock prices:") 
stock=list(map(int,input().split())) 
k=int(input("Enter k value:")) 
print("\nResult=", 
findMaximumSum(stock,k)) 


# 2nd Approach

def cumulative_observable_sum(stock,k):
    sum,m,x=0,0,1
    #loop
    for i in range(len(stock)-k+1):
        #taking sublist having length k
        a=stock[i:i+k]
        x=1
        sum=0
        #finding whether duplicates are there or not
        for j in a:
            #find count
            if(a.count(j)>1):
                x=0
                break
            #cumulative sum
            else:
                sum+=j
        #maximum sum
        if(x==1 and m<sum):
             m=sum
    if(m==0):
        return -1
    else:
        return m
#input list
print("Enter the stock prices:") 
stock=list(map(int,input().split()))
# input k 
k=int(input("Enter k value:"))
#function call
print("\nResult=",
cumulative_observable_sum(stock,k))

#=================================================
# 3rd Approach:

def findMaximumSum(stockPrice, k):
    # Write your code here
    suml=[]
    for i in range(0,len(stockPrice)-k):
        if(len(set(stockPrice[i:i+k]))==k):
            suml.append(sum(stockPrice[i:i+k]))
        
    if len(suml) == 0:
        return -1
    else:
        return max(suml)
        
# 4th Approach    

def findMaximumSum(stockPrice, k):
    # Write your code here
    sumstockprice=[]
    for i in range(0,len(stockPrice)-k):
        if(len(set(stockPrice[i:i+k]))==k):
            sumstockprice.append(sum(stockPrice[i:i+k]))
        
    if len(sumstockprice) == 0:
        return -1
    else:
           return max(sumstockprice)


# 5th Approach:

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
