import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(fibonnaci(scan.nextInt()));
    }
    public static int fibonnaci(int n) {
        if(n<=1){
            return n;
        }
        else{
            return fibonnaci(n-1)+fibonnaci(n-2);
        }
    }
}
