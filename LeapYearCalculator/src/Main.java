import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        boolean data = LeapYearCalc.isLeapYear(1800);
        data = LeapYearCalc.isLeapYear(1800);
        System.out.println(data);
        data = LeapYearCalc.isLeapYear(1900);
        System.out.println(data);
        data = LeapYearCalc.isLeapYear(2100);
        System.out.println(data);
        data = LeapYearCalc.isLeapYear(2200);
        System.out.println(data);
        data = LeapYearCalc.isLeapYear(2300);
        System.out.println(data);
        data = LeapYearCalc.isLeapYear(2500);
        System.out.println(data);

        data = LeapYearCalc.isLeapYear(1600);
        System.out.println(data);
        data = LeapYearCalc.isLeapYear(2000);
        System.out.println(data);
        data = LeapYearCalc.isLeapYear(2400);
        System.out.println(data);
    }
}
