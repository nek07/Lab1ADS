import java.util.Scanner;

public class Lab1Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }*/
        System.out.println(greatCommonDivisor(32,48));



    }
    /*
        @ FindMinimum - definition of min
        @ size - length of array
        @ num- array
        @ return n - return minimum value

     */
    public static int FindMinimum(int size,int[] num){
        int n=num[0]; //store minimum element of array
        for(int i=0;i<size;i++){
            if(num[i]<n){ //checks if element smaller or not
                n=num[i];
            }
        }
        return n; //return min
    }

    /*
        @ average - definition of average of arr elements
        @ n - length of array
        @ numbers - array
        @ sum - contain sum of all elements
        @ return - return average value

     */
    public static double average(int n, double[] numbers){
        int sum=0;
        for(int i=0;i<n;i++){//sums all elements
            sum+=numbers[i];
        }
        return (double)sum/n; //return the sum which divided by arr size
    }

    /*
        @ isPrime - definition of determining is it prime or composite
        @ n - input number
        @ divisor - local variable, helps to exclude composite nums.
        @ return - return 'composite' or 'prime'

     */
    public static String isPrime(int n){
        if(n==1){ //base case
            return "Composite";
        }
        else if(n<=3){ //base case
            return "Prime";
        }
        else if(n%2==0 || n%3==0){ //base case
            return "Composite";
        }
        int divisor=5;
        while(divisor*divisor<=n){ //helps to check number
            if(n%divisor==0 || n%(divisor+2)==0){ //exclude composite nums
                return "Composite";
            }
            divisor+=6;
        }
        return "Prime"; //return final value
    }
    /*
        @ factorial - definition of factorial of num
        @ n - input number
        @ return - return the factorial of number

     */
    public static int factorial(int n){
        if(n<=1){ //base case
            return n;
        }
        else{
            return factorial(n-1)*n; //multiply n by (n-1) in descending order
        }
    }

    /*
        @ fibonacci - definition of fibonacci of num
        @ n - input number
        @ return - return the fibonacci

     */
    public static int fibonacci(int n) {
        if(n<=1){ //base case
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2); //return the representation of formula which find fibonacci number
        }
    }

    /*
        @ pow - definition of power of num
        @ n - input number
        @ return - return the pow of num

     */
    public static int pow(int a,int n){
        if(n==0){ //base case, if n=0 according to formula a=1
            return 1;
        }
        else{
            return pow(a,n-1)*a; //multiply a power times from input
        }
    }
    /*
        @ reverse - definition of reversing array
        @ arr -  array which will be reversed
        @ left - start index
        @ right - stop index
        @ return - return the reversed array

     */
    public static int[] reverse(int[] arr,int left,int right){
        if(right<=1){ //base case
            return arr;
        }
        else{
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            return reverse(arr,left+1,right-1); //replace first and last elements
        }
    }

    /*
        @ isDigit - definition of determining is string has only digits
        @ str - contain char elements
        @ Character.isDigit() - checks 1 char element is it digit or not
        @ l - length of array
    */
    public static boolean isDigit(char[] str, int l){
        if(l==0){//base case
            return true;
        }
        else{
            if(Character.isDigit(str[l])){
                return isDigit(str,l-1); //if it is digit the process continue
            }
            else{
                return false; //if it is not digit func return false and stop
            }
        }
    }

    /*
        @ binomialCoefficient - definition of binomail coef
        @ n - first num according formula
        @ k - second num according formula
    */
    public static int binomialCoefficient(int n,int k){
        if(k==0 || k==n){ //base case according formula
            return 1;
        }
        else{
            return binomialCoefficient(n-1,k-1)+binomialCoefficient(n-1,k); //return the representation of binCoef formula
        }
    }
    /*
        @ greatCommonDivisor - definition of GCD
        @ a - first num
        @ b - second num
    */
    public static int greatCommonDivisor(int a,int b){
        if(b==0){ //base case
            return a;
        }
        else{
            return greatCommonDivisor(b,a%b); //return representation of Euclidean Algorithm
        }
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
