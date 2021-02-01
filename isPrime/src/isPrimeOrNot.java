public class isPrimeOrNot {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1; i < 999; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
            }
        }
        System.out.println("Number of total primes: " + count);
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        //the sq root of a # = the largest factor of that number
//        for(int i = 2; i <= (long) Math.sqrt(n); i++){ //can have i <= n/2, but this ways faster
//            if(n % i == 0) {
//                return false;
//            }
//        }
        /*TEST SPEED of n/2
                for(int i = 2; i <= n/2; i++){ //can have i <= n/2, but this ways faster
                    System.out.println("i is " + i + ", n is "+ n);
            if(n % i == 0) {
                return false;
            }
        }
*/
        //TEST SPEED OF  i <= (long) Math.sqrt(n);
                for(int i = 2; i <= (long) Math.sqrt(n); i++){ //can have i <= n/2, but this ways faster
                    System.out.println("i is " + i + ", n is "+ n);
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
