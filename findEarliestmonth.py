# 1st Approach
def findEarliestMonth(stockPrice): 
    # Write your code here 
    n = len(stockPrice) 
    first = stockPrice[0] 
    average_frst = math.floor(first) 
    second = sum(stockPrice[1:]) 
    average_scnd = math.floor(second/(n-1)) 
    diff = abs(average_frst - average_scnd) 
    result = 1 
    for i in range(1, n-1): 
        first+= stockPrice[i] 
        second-= stockPrice[i] 
        average_frst = math.floor(first/(i+1)) 
        average_scnd = math.floor(second/(n-i-1)) 
        difference_temp = abs(average_frst - average_scnd) 
        if(difference_temp<diff): 
            diff = difference_temp 
            result = i+1 
    return result 

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


#3rd Approach
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

# 4th Approach
#initialize month variable with 0
    month=0
    change=max(stockPrice)
    #Create a list to hold values
    l=[]
    total_sum = 0
    for i in range(len(stockPrice)):
        total_sum+=stockPrice[i]
    left = 0
    left_sum = 0
    while(len(stockPrice)>1):
        left = stockPrice.pop(0)
        l.append(left)
        #Now calculate the average
        left_sum += left
        avg1=left_sum //len(l)
        avg2=(total_sum-left_sum)//len(stockPrice)
        
        if(abs(avg1-avg2)
           

# This is complete logic of a Program
# Remaining codes are in-built

"""
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
"""
