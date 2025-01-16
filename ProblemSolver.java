import java.util.*;

public class ProblemSolver {

    String reverseStringWithoutBuiltInMethod(String s) {
        String reverse = "";
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse = reverse + chars[i];
        }
        return reverse;

    }

    String reverseStringUsingRecursion(String s) {
        if (s.length() == 1) return s;
        return reverseStringUsingRecursion(s.substring(1)) + s.charAt(0);
    }

    String reverseStringUsingBuiltInMethod(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }

    void swapTwoNumberWithoutUsingThirdVariable(int a, int b) {
        System.out.println("before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping: a = " + a + ", b = " + b);

    }

    Map<String, Integer> frequencyOfWords(String s) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = s.split(" ");
        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }
        return frequencyMap;
    }

    Boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    Boolean isPalindromeRecursion(String s, int start, int end) {
        if (s.length() == 1) return true;
        if (start == end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindromeRecursion(s, start + 1, end - 1);
    }

    Boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    Set<Character> findDuplicates(String s) {
        Set<Character> duplicates = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(map.containsKey(c)) {
                duplicates.add(c);
            }else{
                map.put(c,1);
            }
        }
        return duplicates;
    }
    Boolean isArmstrongNumber(int n){
        int length=String.valueOf(n).length();
        int originalNumber=n;
        int sum=0;
        while (n>0){
            int digit= n%10;
            sum= (int) (sum+Math.pow(digit,length));
            n=n/10;
        }
        if(sum==originalNumber) return true;
        return false;
    }
}
