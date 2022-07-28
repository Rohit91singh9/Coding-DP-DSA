# 1st Approach
def findEarliestmonth(stockPrice): 
    #initialize month variable with 0 
    month=0 
    change=max(stockPrice)
    l=[] 
    while(len(stockPrice)>1): 
        l.append(stockPrice.pop(0)) 
        avg1=sum(l)//len(1) 
        avg2=sum(stockPrice)//len(stockPrice) 
        if(abs(avg1-avg2)<change): 
            change=abs(avg1-avg2) 
            month=len(l) 
    return month 
    stockPrice[1,3,2,3] 
print("Minimum changes in the month :",findEarliestmonth(stockPrice)) 


# 2nd Approach
def findEarliestMonth(stockPrice):          
    sum1= 0     
    sum2= sum(stockPrice)     
    n= len(stockPrice) 

    mini= 1000000     
    month= 0  

    for i in range(0, n-1):         
        sum1 += stockPrice[i]         
        sum2 -= stockPrice[i]         
        avg1= sum1 // (i + 1)         
        avg2= sum2 // (n - i - 1)         
        if abs(avg2-avg1)< mini:             
            mini= abs(avg2-avg1)             
            month= i+1          
    return month
print(findEarliestMonth([1,3,2,3]))


# This is complete logic of a Program
# Remaining codes are in-built

"""
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
"""
