import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.List;  

class Result {     
    public static List<String> sortBoxes(List<String> boxList) {          
        Comparator<String> comparator = new Comparator<String>() {             
            @Override             
            public int compare(String box1, String box2) {                 
                // split each junction box into two parts identifier, content                 
                String[] split1 = box1.split(" ", 2);                 
                String[] split2 = box2.split(" ", 2);  

                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));                 
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));                  
                
                // case 1). both boxes are letter-boxes                 
                if (!isDigit1 && !isDigit2) {                     
                    // first compare the content                     
                    int cmp = split1[1].compareTo(split2[1]);                     
                    if (cmp != 0)                         
                        return cmp;                     
                    // boxes of same content, compare the identifiers                     
                    return split1[0].compareTo(split2[0]);                 
                }                  
                // case 2). one of boxes is digit                 
                if (!isDigit1 && isDigit2)                     
                // the letter box comes before digit-boxes                     
                    return -1;                 
                else if (isDigit1 && !isDigit2)                     
                    return 1;                 
                else                     
                // case 3). both boxes are digit                     
                    return 0;             
            }         
        }; 
                 
        Collections.sort(boxList, comparator);         
        return boxList;     
    } 
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ykc 82 01");
        list.add("eo first qpx");
        list.add("09z cat hamster");
        list.add("06f 12 25 6");
        list.add("az0 first qpx");
        list.add("236 cat dog rabbit snake");
        System.out.println(sortBoxes(list));
    }

}

/* 
NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, 
    feel free to share me the Code which will help other candidates.
    I would love to hear from you on the Mail ID I have Provided. 
    if you've cracked the Interview.

    beingactual@gmail.com
    
*/ 

