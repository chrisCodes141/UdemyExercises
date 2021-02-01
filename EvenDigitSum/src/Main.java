public class Main {


    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2547));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        String s = Integer.toString(number);
        int sLength = s.length();
        int sum = 0;
        for(int i = 0; sLength != 0; sLength-- ){
            if((Integer.parseInt(Integer.toString(number).substring(i, i+1)) % 2) == 0){
                sum += Integer.parseInt(Integer.toString(number).substring(i, i+1));
            }
            i++;
        }
        return sum;
    }
}
