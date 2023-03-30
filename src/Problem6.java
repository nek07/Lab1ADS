import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int n=scan.nextInt();
        System.out.println(pow(a,n));
    }
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        else{
            return pow(a,n-1)*a;
        }
    }
}
