import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        double[] arr=new double[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("average = " + average(size, arr));


    }
    public static double average(int n, double[] numbers){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=numbers[i];
        }
        return (double)sum/n;
    }
}
