def minimumGroups(awards,k):
 
    out=[]
    awards.sort() 
    i=0
    count=0
    while(i<len(awards)):
        count+=1
        count2=0
        temp=awards[i]
        limit=0
        if(temp==awards[-1]):
            i+=1
        for j in range(i+1,len(awards)):
            count2+=1
            limit=abs(temp-awards[j])
            if(count2==len(awards)-1):
                i+=count2+1
                
            if(limit>k):
                i+=count2
                break
            
    return count
awards=[1,13,6,8,9,3,5]     # (or)  awards=[3,1,4,3,9]
k=4                         # (or)  k=10
print(minimumGroups(awards,k))



# This is complete logic of a Program in Python
# Remaining codes are in-built

# NOTE_

#    I completed this Assessment during Amazon Hackerrank 1st Round 

#   If you can figure out any other Approach to solve this problem, feel free to share me the code 
#   which will help other candidates
#   I would love to hear from you if you've cracked the Interview.
#   beingactual@gmail.com