public class Main {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(100,25));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 0 || second < 0){
            return -1;
        }
        int gcd = 0;
        int max = first > second? first : second;

        for(int i = 1; i <= max; i++){
            if(first % i == 0 && second % i == 0){
                gcd = i;
           }
        }
        return gcd;
    }
}
