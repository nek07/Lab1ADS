import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Minimum = " + FindMinimum(size, arr));


    }
    public static int FindMinimum(int size,int[] num){
        int n=num[0];
        for(int i=0;i<size;i++){
            if(num[i]<n){
                n=num[i];
            }
        }
        return n;
    }

}

