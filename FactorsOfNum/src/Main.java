public class Main {
    public static void main(String[] args) {
        System.out.println(PrintFactors(6));
    }
    static public String PrintFactors(int num){
        if(num < 1){
            return "Invalid Value";
        }
        String s = "";
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                s += i+ " ";
            }
        }
        s += num;
        return s;
    }
}
