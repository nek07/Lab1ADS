import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int[] result=new int[size];
        printArr(reverse(arr,result,size-1));

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
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
