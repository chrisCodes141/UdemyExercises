public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(15890));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        String s = Integer.toString(number);
        System.out.println("s is: "+s);
        int sLength = s.length();
        System.out.println("sLength is: "+sLength);
        int firstD = Integer.parseInt(Integer.toString(number).substring(0, 1));
        System.out.println("firstD is "+firstD);
        int lastD = number % 10;
        System.out.println("LastD is "+lastD);
        int sum = firstD+lastD;
        return sum;
    }
}
