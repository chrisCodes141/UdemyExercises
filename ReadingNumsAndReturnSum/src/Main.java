import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0, sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine();//handles end of line (enter key)
        }

        System.out.println("Sum = " + sum);
        sc.close();


        /* My code prints twice for some odd reason wen invalud input
        Scanner sc = new Scanner(System.in);

        int count = 1;
        boolean tf;
        int sum = 0;
        int input = 0;
        System.out.println("I will add up 10 #'s for u");
        while(count < 10){
            System.out.println("What is #"+count+"? ");
            tf = sc.hasNextInt();
            if(tf){
                input = sc.nextInt();
                sum += input;
                count++;
            } else {
                System.out.println("Invalid input try again");
                sc.nextLine();
                continue;
            }
        }
        System.out.println("Sum is " + sum);*/
    }
}
