import java.util.Scanner;  
class Letters {          
    private char letter;     
    private int frequency;        
    public Letters(char letter) {         
        this.letter = letter;         
        this.frequency = 0;     
    }           
    public char getLetter() {         
        return letter;     
    }      
    public int getFrequency() {         
        return frequency;     
    }         
    public void incrementFrequency() {         
        this.frequency++;     
    }  
}  

public class minimumKeypadClickCoun { 

    public static void main(String[] args) {          
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the string: ");         
        String s = sc.next();              
        Letters[] letters = new Letters[26];                 
        for (int i = 0; i < letters.length; i++) {             
            char c = (char) ('a' + i);             
            letters[i] = new Letters(c);         
        }                  
        for (int i = 0; i < s.length(); i++) {             
            int index = s.charAt(i) - 'a';             
            letters[index].incrementFrequency();         }                 
            for (int i = 0; i < letters.length - 1; i++) {             
                for (int j = 0; j < letters.length - i - 1; j++) {                 
                    int f1 = letters[j].getFrequency();                 
                    int f2 = letters[j+1].getFrequency();                  
                    if (f1 < f2) {                     
                        Letters temp = letters[i];                     
                        letters[i] = letters[j];                     
                        letters[j] = temp;                 
                    }             
                }         
            }                
            int answer = 0;                         
            for (int i = 0; i < letters.length; i++) {             
                if (i < 9) {                 
                    answer += letters[i].getFrequency();             
                } else if (i < 18) {                 
                    answer += (letters[i].getFrequency() * 2);             
                } 
                else 
                {                 
                    answer += (letters[i].getFrequency() * 3);             
                }         
            }          
            System.out.println("Minimum clicks required: " + answer);          
            String[] keypad = {"", "", "", "", "", "", "", "", ""};              
            for (int i = 0; i < letters.length; i++) {             
                keypad[i % 9] += letters[i].getLetter();         
            }          // print the keypad         
            System.out.println("\nkeypad:");         
            for (int i = 0; i < keypad.length; i++) {             
                System.out.print(keypad[i] + " ");              
                if (i % 3 == 2) {                 
                    System.out.println();             
                }         
            }     
        } 
    } 

// Let me know if any testcases fails i will update the code.