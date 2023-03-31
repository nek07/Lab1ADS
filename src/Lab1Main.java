import java.util.Scanner;

public class Lab1Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }*/


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

    public static double average(int n, double[] numbers){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=numbers[i];
        }
        return (double)sum/n;
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

    public static int factorial(int n){
        if(n<=1){
            return n;
        }
        else{
            return factorial(n-1)*n;
        }
    }
    public static int fibonnaci(int n) {
        if(n<=1){
            return n;
        }
        else{
            return fibonnaci(n-1)+fibonnaci(n-2);
        }
    }
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        else{
            return pow(a,n-1)*a;
        }
    }
    public static int[] reverse(int[] arr,int[] revArr,int n){
        if(n==-1){
            return arr;
        }
        else{
            reverse(arr,revArr,n-1);
            revArr[revArr.length-n-1]=arr[n];
            return revArr;
        }
    }

}

