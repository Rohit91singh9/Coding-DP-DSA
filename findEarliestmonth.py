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
        print("Minimum dnanges in the month :",findEarliestmonth(stockPrice)) 


# This is complete logic of a Program
# Remaining codes are in-built

""""
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
"""