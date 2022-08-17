# Approach 1 (Python)
def getEncryptedNumber(numbers): 
    temp_storage=[] 
    
    if len(numbers)<=1: 
        return(numbers[0]) 
        
    while len(numbers)!=2: 

        for item in range(len(numbers)-1): 
            new_item=numbers[item]+numbers[item+1] 
            if new_item>9: 
                new_item=new_item%10 
            temp_storage.append(new_item) 
        numbers=temp_storage 
        temp_storage=[] 
        
    return(str(numbers[0])+str(numbers[1])) 
  
  
  # Approach 2 (Python)
  def Encryption(text):
    while(len(text)>2):
        temp = ''

        for i in range(len(text) - 1):
            if (int(text[i]) + int(text[i+1])) > 9:
                temp += str( int(text[i]) + int(text[i+1]) - 10)
            else:
                temp += str( int(text[i]) + int(text[i+1]))
        text = temp
    return text

## Define main function ##
#Enter user input
text = input("Enter a number to be encrypted: ")
#calling and printing the function.
print('Encrypted number:',Encryption(text))


# Approach 3 (C++)
string getEncryptionNumber(int a[], int n){
    // n-2th Pascal triangle line
    int prev=1, t=n-2;
    int f=a[0],e=a[n-1];
    for(int i=1;i<=t;i++){
        int curr = (prev*(t-i+1))/i;
        prev=curr;
        f+=(a[i]*curr);
        e+=(a[n-i-1]*curr);
    }
    return to_string(f%10)+to_string(e%10);
}
