public class Main {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(91, 89));
    }
    public static boolean hasSharedDigit(int n1, int n2){
        if ((n1 < 10 || n1 > 99) || (n2 < 10 || n2 > 99)){
            return false;
        }
        for(int i = 0; i < 2; i++){
            int n1Digit = Integer.parseInt(Integer.toString(n1).substring(i, i+1));
            for(int j = 0; j < 2; j++){
                int n2Digit = Integer.parseInt(Integer.toString(n2).substring(j, j+1));
                if(n1Digit == n2Digit){
                    return true;
                }
            }
        }
        return false;
    }
}
