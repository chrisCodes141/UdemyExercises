public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
        int Dint1 = (int)(d1*1000);
        int Dint2 = (int)(d2*1000);
        System.out.println(Dint1);

        double Ddouble1 = (double)Dint1/1000;
        double Ddouble2 = (double)Dint2/1000;
        System.out.println(Ddouble1);

        if(Ddouble1 == Ddouble2){
            return true;
        }
        return false;
    }
}
