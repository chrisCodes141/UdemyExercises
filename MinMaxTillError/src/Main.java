import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int min = 0, max = 0, number;
        boolean first = true, isAnInt; //isAnInt is a flag! you don't need flag if set min = Integer.MIN_VALUE and max = Integer.MAX_VALUE
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            isAnInt = in.hasNextInt();
            if (isAnInt) {
                number = in.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (min > number) min = number;
                if (max < number) max = number;
            } else {
                break;
            }
        }
        System.out.println("Min = " + min + ", Max = " + max);
    }
}