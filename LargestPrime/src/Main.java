public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int n){
        // Initialize the maximum prime
        // factor variable with the
        // lowest one
        int maxPrime = -1;

        // Print the number of 2s
        // that divide n
        while (n % 2 == 0) {
            maxPrime = 2;
            // equivalent to n /= 2
            n >>= 1;
        }
        // n must be odd at this point,
        // thus skip the even numbers
        // and iterate only for odd
        // integers
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
        }
        // This condition is to handle
        // the case when n is a prime
        // number greater than 2
        if (n > 2)
            maxPrime = n;

        return maxPrime;
    }
}
    /* MY SOLUTION NOT ACCEPTED CUZ 2 METHODS
    public static int getLargestPrime(int n){
        int LargestPrime = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0) {
                if (isPrime(i)) {
                    LargestPrime = i;
                }
            }
        }
        return LargestPrime;
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}*/