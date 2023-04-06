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

Base cases:
Firstly, if `n==1` then it is not prime number. Secondly, if `n<=3` then it is prime number. Thirdly, if `n%2==0` or `n%3==0` means that if number divisible by 2 or 3 without remainder, then it is not prime.

Recursive case:
There is existed local variable `divisor`, which equals to 5 in the beginning of recursive case, also there is `while` loop, which condition `divisor*divisor<=n` and `divisor+=6` increment responsible for avoiding error, infinite loop. In loop, condition `n%divisor==0 || n%(divisor+2)==0` used to exclude numbers, which divisible by small prime numbers. If all the condition do not correct, then function return `prime` in final stage.

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

base case:
If `n<=1` function return n and stop.

recursive case:
function `factorial(n-1)` calls himself, also multiply to `n`, which is a representation of `n*n(-1)`.It continues until `n>1` and the base case will stop the function.

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

Base case:
If `n<=1` the function return n and stop.

Recursive case:
In recursive case function calls himself twice and find their sum `fibonnaci(n-1)+fibonnaci(n-2)` which is representation of fibonacci's formula. It continues until base case do not executed.

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

Base case: if `n==0` function just return `1` and stop function.

Recursive case: function return `pow(a,n-1)*a` until `n!=0`, `n-1` in this case is decrement.

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
Base case:
If `right<=1` is the representation of array's size. If size equals `1`, then function `return arr` and stop.

Recursive case: In function we are increasing `left` and decreasing `right` variables and swap elements of array by `left` and `right` indexes while `left < right`.
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