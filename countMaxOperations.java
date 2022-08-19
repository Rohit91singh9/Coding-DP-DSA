// Approach 1

public static int countMaximumOperations(String s, String t) {
    // Write your code here
    int sLength = s.length();

    Map<Character, Integer> freqS = new HashMap<>();

    for (int i = 0; i < sLength; i++) {
        char current = s.charAt(i);

        int count = freqS.getOrDefault(current, 0);
        freqS.put(current, count + 1);
    }

    int tLength = t.length();
    Map<Character, Integer> freqT = new HashMap<>();

    for (int i = 0; i < tLength; i++) {
        char current = t.charAt(i);

        int count = freqT.getOrDefault(current, 0);
        freqT.put(current, count + 1);
    }

    int result = Integer.MAX_VALUE;

    for (char key : freqT.keySet()) {
        int currentCount = freqS.getOrDefault(key, 0);
        int requiredCount = freqT.get(key);

        result = Math.min(result, currentCount / requiredCount);
    }

    return result == Integer.MAX_VALUE ? -1 : result;
}


// Approach 2

/*
public static int countMaxOperations(String s, String t) {
        int sLength = s.length();
        Map<Character, Integer> freqS = new HashMap<>();

        for (int i = 0; i < sLength; i++) {
            char current = s.charAt(i);

            int count = freqS.getOrDefault(current, 0);
            freqS.put(current, count + 1);
        }

        int tLength = t.length();
        Map<Character, Integer> freqT = new HashMap<>();

        for (int i = 0; i < tLength; i++) {
            char current = t.charAt(i);

            int count = freqT.getOrDefault(current, 0);
            freqT.put(current, count + 1);
        }

        int result = Integer.MAX_VALUE;

        for (char key : freqT.keySet()) {
            int currentCount = freqS.getOrDefault(key, 0);
            int requiredCount = freqT.get(key);

            result = Math.min(result, currentCount / requiredCount);
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
 */


/* NOTE:

    I completed this Assessment during Amazon Hackerrank 1st Round 

    If you can figure out any other Approach to solve this problem, I would love to hear
    from you on the Mail ID I have Provided. if you've cracked the Interview.

    beingactual@gmail.com

*/

