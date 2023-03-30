import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(isPrime(scan.nextInt()));
    }
    public static String isPrime(int n){
        if(n==1){
            return "Composite";
        }
        else if(n<=3){
            return "Prime";
        }
        else if(n%2==0 || n%3==0){
            return "Composite";
        }
        int divisor=5;
        while(divisor*divisor<=n){
            if(n%divisor==0 || n%(divisor+2)==0){
                return "Composite";
            }
            divisor+=6;
        }
        return "Prime";
    }
}
