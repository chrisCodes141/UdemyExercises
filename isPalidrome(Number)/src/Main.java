public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-123));
    }
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
        /* MY OLD SOLUTION DONT WORK FOR NEGATIVES
    public static Boolean isPalindrome(int number){
        if(number < 0){
            number =  Math.abs(number);
        }
        String testS = Integer.toString(number);
        int SLength = testS.length();
        String sReversed = "";
        char c;

        for(int i = 1; SLength != 0; SLength--){
            c = testS.charAt(testS.length() - i);
            i++;
            sReversed += c;
        }
        if(testS.equals(sReversed)){
            return true;
        }
        return false;
    }*/
}

