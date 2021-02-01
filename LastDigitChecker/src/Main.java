public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 32, 42));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if((!isValid(n1)) || (!isValid(n2)) || (!isValid(n3))){
            return false;
        }
        int lastDn1 = n1 % 10;
        int lastDn2 = n2 % 10;
        int lastDn3 = n3 % 10;

        if((lastDn1 == lastDn2) || (lastDn1 == lastDn3) || (lastDn2 == lastDn3)){
            return true;
        }
        return false;
    }
    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
