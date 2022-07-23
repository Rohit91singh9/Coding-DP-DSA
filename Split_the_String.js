function Split_the_String(S,k){    
    let n = S.length;    
    var arr = new Array(k);    
    var i=n/k;    
    var j=0;    
    var res="";    
    var m=0,m1=0,m2=0;    
    while(m<k){       
        if(j<=i)         
            res+=S[m1++];       
        else{         
            arr[m]=parseInt(res,2);         
            res="";                  
            
            j=0;         
            m++;       
        }       
        j++;    
    }    
    var l = arr[0];    
    for(let i=1;i<arr.length;i++){      
        if(arr[i]!=l)m2=1;    
    }    
    i=n/k;    
    m=0;    
    m1=0;    
    j=0;        
    if(m2==1){      
    while(m<k){       
        if(j<i-1)         
            res+=S[m1++];       
        else{         
            if(m==k-1)res+=S[m1++]+S[m1];  
                arr[m]=parseInt(res,2);         
            res="";        
            j=0;         
            m++;       
        }       
        j++;    
        }    
        
        l = arr[0];    
        m2=0;    
    for(let i=1;i<arr.length;i++){      
        if(arr[i]!=l)m2=1;    
    }    
                    
    if(m2==1)return 'NO';    
    }        
        return 'YES'; 
} 
console.log(Split_the_String("010100101",2));


/*
# This is complete logic of a Program in JavaScript
# Remaining codes are in-built

"""
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, feel free to share me the Code
    I would love to hear from you if you've cracked the Interview.
    beingactual@gmail.com
*/
