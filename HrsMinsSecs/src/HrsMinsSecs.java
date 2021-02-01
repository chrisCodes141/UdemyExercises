public class HrsMinsSecs {

    //final is constant, all UPPERCASE general rule
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long Mins, long Secs){
        if((Mins < 0) || (Secs < 0 || Secs > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        long hours, Rmins;

        hours = Mins/60;
        Rmins = Mins%60;

/*        //if you want leading 0's when values less than 10
        String hoursString = hours + "h";
        if(hours < 10){
            hoursString = "0" + hoursString;
        }
        String minutesString = hours + "h";
        if(hours < 10){
            minutesString = "0" + minutesString;
        }
        String secondsString = hours + "h";
        if(hours < 10){
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;
*/
        return hours + "h " + Rmins + "m " + Secs + "s";
    }
    public static String getDurationString(long Secs){
        if(Secs < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long Mins = Secs/60;
        long RSecs = Secs%60;
        return getDurationString(Mins, RSecs);
    }
}
