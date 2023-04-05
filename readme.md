# Assignment1 Documentation
 This is my first assignment of Algorithms and Data structures, there is you can see detailed information and explanations of every task.

## Lab1Main.java file [src](src/Lab1Main)
**Each method of tasks belong to this class. Below will be described every function that used to solve problems.**

## 	:computer: Task 1
**Description:**
Return the minimum value in an array.

**Explanation:**In the `FindMinimum` method `n = num[i]` responsible for containing the minimum value in an array, which determined by `n<num[i]` condition in `for` loop and if it is true,then `n=num[i]`, otherwise `n` does not change the value.
`return n` responsible for returning the minimum value.

**Solution:**
```java
public static int FindMinimum(int size,int[] num){
        int n=num[0];
        for(int i=0;i<size;i++){
            if(num[i]<n){
                n=num[i];
            }
        }
        return n;
    }
```
## 	:computer: Task 2
**Description:**
Return average value of array.

**Explanation:**
Firstly in the main body of `average` method,we determine the sum of all the elements which `double[] numbers` contain by using `for` loop. Secondly, in `return (double)sum/n` we divide sum by `n`,where `n` equals to the number of elements in `numbers`.

**Solution:**
```java
public static double average(int n, double[] numbers){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=numbers[i];
        }
        return (double)sum/n;
    }
```

## 	:computer: Task 3
**Description:**
Check is the number prime or composite.

**Explanation:**


**Solution:**
```java
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
```

## 	:computer: Task 4
**Description:**
Return the factorial of number.

**Explanation:**


**Solution:**
```java
public static int factorial(int n){
        if(n<=1){
            return n;
        }
        else{
            return factorial(n-1)*n;
        }
        }
```

## 	:computer: Task 5
**Description:**
Return the number on n-th position of fibonacci sequence

**Explanation:**


**Solution:**
```java
public static int fibonnaci(int n) {
        if(n<=1){
            return n;
        }
        else{
            return fibonnaci(n-1)+fibonnaci(n-2);
        }
    }
```
## 	:computer: Task 6
**Description:**
Return a number to the power of n.

**Explanation:**


**Solution:**
```java
public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        else{
            return pow(a,n-1)*a;
        }
    }
```

## 	:computer: Task 7
**Description:**
Reverse the array without using array data structure.

**Explanation:**


**Solution:**
```java
public static int[] reverse(int[] arr,int left,int right){
        if(right<=1){
            return arr;
        }
        else{
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            return reverse(arr,left+1,right-1);
        }
    }
```

## 	:computer: Task 8
**Description:**
Checks is the `char` array contains only digits or not.

**Explanation:**


**Solution:**
```java
public static boolean isDigit(char[] str, int l){
        if(l==0){
            return true;
        }
        else{
            if(Character.isDigit(str[l])){
                return isDigit(str,l-1);
            }
            else{
                return false;
            }
        }
    }
```

## 	:computer: Task 9
**Description:**
Return the binomial coefficient of `n` and `k` parameters.

**Explanation:**


**Solution:**
```java
public static int binomialCoefficent(int n,int k){
        if(k==0 || k==n){
            return 1;
        }
        else{
            return binomialCoefficent(n-1,k-1)+binomialCoefficent(n-1,k);
        }
    }
```

## 	:computer: Task 10
**Description:**
Find GCD of `a` and `b` by using Euclid Algorithm.

**Explanation:**


**Solution:**
```java
public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
```