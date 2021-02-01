public class Main {
    public static void main(String[] args) {
        System.out.println(perfectNumberChecker(28));
    }
    public static boolean perfectNumberChecker(int number) {
        if (number < 1)
            return false;
        int divisor = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisor = divisor + i;
                if (divisor == number) {
                    return true;
                }
            }
        }
        return false;
    }
    //the following code works, but has issue with on udemy checker
    /*public static boolean perfectNumberChecker(int n){
        boolean b = false;
        int[] INTarr = new int[100];// Not sure how to make auto increment
        //List<Integer> intList = new ArrayList<Integer>();
        if(n < 1){
            return false;
        }
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                INTarr[i-1] = i;
                //intList.add(i);
            }
        }
        int sum = 0;
        for(int i = 0; i <= n; i++){
            System.out.println(INTarr[i]);
            sum += INTarr[i];
        }
        System.out.println(sum);
        if(sum == n) b = true;
        return b;
    }*/
}
