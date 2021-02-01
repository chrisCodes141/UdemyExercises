public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        if(number % 2 == 1){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((start <= 0 || end <= 0) || (end < start)){
            return -1;
        }
        for(int i = 0; start <= end; start++){
            if(isOdd(start)){
                sum += start;
            }
        }
        return sum;
    }
}
