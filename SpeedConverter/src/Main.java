public class Main {

    public static void main(String[] args) { // type psvm+tab for pub static void main
        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}