public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(5701));
    }
    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        int lastV = 0;
        while(number >= 10){
            lastV = number % 10;
            sum += lastV;
            number /= 10;
            if(number < 10){
                sum += number;
                break;
            }
        }

        return sum;
        /*another solution
        while(number > 0){
            lastV = number % 10;
            sum += lastV;
            number /= 10;
        }
         */
    }
}



