

public class Problem1 {
    public static void main(String[] args) {
        int[] arr1 = {10, 1, 32, 3, 45};
        int[] arr2 = {5, 4, -100, 49, 34, 54};
        System.out.println("Minimum = " + FindMinimum(5, arr1));
        System.out.println("Minimum = " + FindMinimum(arr2.length, arr2));

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

