public class MinsToYrsNDays {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long years = 0, days;
            //1 day = 1440 minutes

            days = minutes / 1440;
            if(days > 364){
            years = days / 365;
            days = days % 365;
            }
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
