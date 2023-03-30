import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(factorial(scan.nextInt()));

    }
    public static int factorial(int n){
        if(n<=1){
            return n;
        }
        else{
            return factorial(n-1)*n;
        }
    }
}
