public class Main {
    public static void main(String[] args) {
        printSquareStar(-9);
    }
    public static void printSquareStar(int n){
        if(n<5){
            System.out.println("Invalid Value");
            return;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n-1){
                    System.out.print("*");
                }
                else if(j == 0 || j == n - 1){
                    System.out.print("*");
                }
                else if(i == j){
                    System.out.print("*");
                }
                else if(j == (n - (i + 1))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
