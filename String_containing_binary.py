""" 1st Approach """

def solution(s):   
    # Converting binary string to decimal   
    decimal_number = int(s, 2)    
    
    # Defining variable to count no of operations required   
    operations_count = 0    

    # loopping until decimal number becomes 0   
    while decimal_number > 0:     
        # if Even, divide the number by 2     
        if decimal_number % 2 == 0:       
            decimal_number /= 2     
        # if Odd, subtract 1 from it     
        else:       
            decimal_number -= 1     
        # incrementing operations count by 1     
        operations_count += 1   
    return operations_count  
    
    # validating solution function 
print("solution('011100'):", solution('011100')) 
print("solution('111'):", solution('111')) 
print("solution('1111010101111'):", solution('1111010101111')) 



""" 2nd Approach """

def solution(s):     
    c = 0     
    d = int(s,2) 
    #convert binary string to decimal number     
    while d!=0:         
        if d%2==1:             
            d = d - 1  
            # v is odd then substract from d         
        else:             
            d = d // 2 
            # v is even then divide by 2          
            c = c + 1  
            #count the number of operations     
            return c  
        s = input("Enter String in a binary number representation: ") 
        x = solution(s) 
        print("Number of operations : ",x)
        


""" 3rd Approach """

def method(S):
    V = int(S,2)
    print('Decimal form of {} is {}\n'.format(S, V))
    operationCount = 0
    while V != 0:
        if V % 2 == 0:
            print('V = {}\t->\t even  divide by 2, Now V = {}'.format(int(V), int(V / 2)))
            V /= 2
        else:
            print('V = {}\t->\t odd  subtract 1, Now V = {}'.format(int(V), int(V-1)))
            V -= 1
        operationCount += 1
    print('\nNumber of operations =', operationCount)


method('011100')


""" NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    feel free to share me the Code which will help other candidate.
    I would love to hear from you on the Mail ID I have Provided. 
    if you've cracked the Interview.

    beingactual@gmail.com

"""