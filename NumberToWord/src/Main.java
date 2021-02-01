public class Main {
    public static void main(String[] args) {
        System.out.println(ConvertToString(-037)); // doesnt work for numbers starting w/ 0 and for SOME ODD REASON -038 nd less
        //System.out.println(getDigitCount(-12342323));
        System.out.println(numberToWords(-12000));//doesnt work on
        System.out.println(numberToWords(345678976));
        int i = 0400;
        int i2 = -31;
    }

    private static StringBuilder ConvertToString(int n) {
        int revN = 0;
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int digit = n % 10;
            sb.append(digit);
            n /= 10;
        }
        return sb.reverse();
    }
    public static String numberToWords(int n){
        String [] sarry = new String[]{
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        boolean negative = n < 0;
        StringBuilder sNumber = ConvertToString(Math.abs(n));
        StringBuilder number = new StringBuilder();
        if(negative)
            number.append("Minus ");
        int num;
        for(int i = 0; i < sNumber.length() ; i++){
            num = Integer.parseInt(sNumber.substring(i, i + 1));
            number.append(sarry[num]);
            if(i < sNumber.length() - 1)
                number.append(' ');
        }
        return number.toString();
    }
}

/*

public class Main {
    public static void main(String[] args) {
        //System.out.println(reverse(-037)); // doesnt work for numbers starting w/ 0 and for SOME ODD REASON -038 nd less
        //System.out.println(getDigitCount(-12342323));
        System.out.println(numberToWords(-12000));//doesnt work bcuz there isn't a number like 00021
        System.out.println(numberToWords(68));
        int i = 0400;
        int i2 = -31;
    }

    private static int reverse(int n) {
        int revN = 0;

        while(n != 0){
            int digit = n % 10;
            revN = revN*10 + digit;
            n /= 10;
        }
        System.out.println("n = " + n);

        return revN;
    }
    public static String numberToWords(int n){
        String s = "";
        int revN = reverse(n);
        int lastD;
        int Dcount = getDigitCount(n);
        while(Dcount != 0){
            lastD = revN % 10;
            revN /= 10;
            switch(lastD) {
                case 0: s += "Zero ";break;
                case 1: s += "One ";break;
                case 2: s += "Two ";break;
                case 3: s += "Three ";break;
                case 4: s += "Four ";break;
                case 5: s += "Five ";break;
                case 6: s += "Six ";break;
                case 7: s += "Seven ";break;
                case 8: s += "Eight ";break;
                case 9: s += "Nine ";break;
            }
            Dcount--;
        }


        //if you want seperated by lines
//        while(revN != 0){
//            lastD = revN % 10;
//            revN /= 10;
//            switch(lastD) {
//                case 0: s += "Zero\n";break;
//                case 1: s += "One\n";break;
//                case 2: s += "Two\n";break;
//                case 3: s += "Three\n";break;
//                case 4: s += "Four\n";break;
//                case 5: s += "Five\n";break;
//                case 6: s += "Six\n";break;
//                case 7: s += "Seven\n";break;
//                case 8: s += "Eight\n";break;
//                case 9: s += "Nine\n";break;
//            }
//        }
        return s;
    }
    public static int getDigitCount(int n){
        if(n == 0) return 1;
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }
}
*/