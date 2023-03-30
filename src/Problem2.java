public class Problem2 {
    public static void main(String[] args) {
        double[] arr1 = {3,2,4,1};
        double[] arr2 = {5, 4, 100, 49, 34, 54};
        System.out.println("average = " + average(4, arr1));
        System.out.println("average = " + average(arr2.length, arr2));

    }
    public static double average(int n, double[] numbers){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=numbers[i];
        }
        return (double)sum/n;
    }
}
