public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kik"));
    }
    public static Boolean isPalindrome(String s){
        String testS = s;
        int SLength = s.length();
        String sReversed = "";
        char c;

        for(int i = 1; SLength != 0; SLength--){
            c = testS.charAt(testS.length() - i);
            i++;
            sReversed += c;
        }
        if(s.equals(sReversed)){
            return true;
        }
            return false;
    }
}
