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

    int reverseNumber(int num){
        String reverse = "";
        while (num != 0){
            int digit = num % 10;
            reverse = reverse + digit;
            num=num/10;

        }
        return Integer.parseInt(reverse);
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

    int greatestCommonDivisor(int a, int b) {
        int rem;
        do{
            rem=a%b;
            a=b;
            if(rem!=0) b=rem;
        }while (rem!=0);
        return b;
    }

    Boolean isPerfectNumber(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n) return true;
        return false;
    }

    Boolean isAnagram(String s, String t) {
        char[] chars = s.toLowerCase().toCharArray();
        char[] charsT = t.toLowerCase().toCharArray();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        if(chars.length!=charsT.length) return false;
        for (int i = 0; i < chars.length; i++) {
            if(frequencyMap.containsKey(chars[i])){
                frequencyMap.put(chars[i], frequencyMap.get(chars[i])+1);
            }
            frequencyMap.put(chars[i],1);
        }
        for (int j = 0; j < charsT.length; j++) {
            if(!frequencyMap.containsKey(charsT[j])){
                return false;
            }
            if(frequencyMap.get(charsT[j])==1){
                frequencyMap.remove(charsT[j]);
            }else {
                frequencyMap.put(charsT[j],frequencyMap.get(charsT[j])-1);
            }
        }
        return frequencyMap.isEmpty();
    }

    Integer convertDecimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int quotient = n/2;
            int remainder = n%2;
            sb.append(remainder);
            n=quotient;

        }
        return Integer.parseInt(sb.reverse().toString());

    }

    Integer fibonacciRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    Integer fibonacciIterative(int n) {
       if (n == 0) return 0;
       if (n == 1) return 1;
       int x=0,y=1;
       for(int i=2;i<=n;i++){
          int  temp= y;
          y= x+y;
          x=temp;
       }
       return y;

    }
}
