import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static  void inputThenPrintSumAndAverage()
    {
        int sum=0;
        long avg=0;
        int count=0;
        boolean first=false;
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            boolean isAnInt=sc.hasNextInt();
            if(isAnInt) {
                int number = sc.nextInt();
                sum += number;
                count++;
                first=true;
            }
            else
                break;
        }
        sc.close();
        if(first)
            avg=Math.round((double)sum/(double)count);

        System.out.println("SUM = "+sum+" AVG = "+avg);
    }
}