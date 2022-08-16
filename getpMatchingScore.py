#user inputs
str1 = input()
str2 = input()
p = int(input())

#sorting the second string
str2 = ''.join(sorted(str2))

#length of strings
l1 = len(str1)
l2 = len(str2)

#output variable storing the count of return strings
count = 0

#for loop to iterate each case
for i in range(l1-(l2*p)+1+1):
    temp = [] #temp variable
    
    #making the temp variable
    for j in range(l2):
        temp.append(str1[i + j*p])
        
    #making a sorted string out of the list
    temp = ''.join(sorted(temp))
    
    #if string is equal to given input
    if(temp == str2):
        count+=1

#printing the output
print(count)    
    
 