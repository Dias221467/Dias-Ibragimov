# Dias-Ibragimov
## 1 assignment
### Task 1

__Description:__ _Return the minimum value of an array_ 

__Explanation:__ _if n = 1, then we return the first element of the array. Otherwise, firstly we define min and gives make it's value as first element of array,
then we compare min with the next other element of array, so we can find the smallest one._

__Solution:__
````Java
 public static int find_minimum(int n1, int[] arr){
        int min = arr[0]; //define the first element as the min
        for (int i = 1; i < n1; i++) {
            if (arr[i] < min) { //compare other numbers with min
              min = arr[i];
            }
        }
        return min; // result the min of array
}
````

### Task 2

__Description:__ _Return the average of the array_

__Explanation:__ _Here we create function total that displays the sum of all elements in array,
and then using for we give value to out total by summing it with every element of array, and then we
divide the total on the length of array_

__Solution:__

````Java
public static int find_average(int n2, int[] arr2){
        int total = 0; //creating int total
        for(int i = 0; i<n2; i++){
            total= arr2[i] + total; //defining the total sum of numbers in array
        }
        return total/n2; // find the average of array
    }
````

### Task 3

__Description:__ _Define if the number is prime or not_

__Explanation:__ _This function takes an integer n3 as input and checks whether the input number is a prime number or not. 
It does this by iterating over all numbers from 1 to n3 and checking if n3 is divisible by any of these numbers other than 
1 and itself. If it is, the function returns "Composite", indicating that the number is not prime. If it is not, the function 
returns "Prime", indicating that the number is prime._

__Solution:__
````Java
public static String define_prime_number(int n3){
       int count = 0; // create int countdown
       for (int i = 1; i < n3; i++){
           if(n3%i == 0){ // looking if any numbers expect number itself could be divider
               count = count + 1; // count how many numbers are divider
           }
       }
       if (count >= 2){
           return "Composite"; // if there are 2 or except itself more divider this number is not prime
       }
       else{
           return "Prime"; // otherwise it's a prime number
       }
    }
````

### Task 4

__Description:__ _Defining the factorial of given number using recursion_

__Explanation:__ _This function takes an integer n4 as input and calculates its factorial, which is the product of all 
positive integers up to n4. It uses recursion to repeatedly call the function with smaller values of n4 until it reaches 
the base case of n4 = 1, at which point it returns 1._

__Solution:__

````Java
 public static int factorial(int n4){
        if(n4 == 1)
            return 1; // if the number is 1, factorial of this number will be 1
        return n4 * factorial(n4-1); // finding factorial through recursive call, by multiplying it numbers that lower then itself
    }
````

### Task 5

__Description:__ _Finding the n-th element of Fibonacci sequence_

__Explanation:__ _This function takes an integer n5 as input and calculates the nth Fibonacci number, where the Fibonacci sequence is defined as the sequence of numbers in which each number is the sum of the two preceding ones, starting from 0 and 1. It uses recursion to repeatedly call the function with smaller values of n5 until it reaches the base case of n5 = 0 or n5 = 1, at which point it returns the corresponding Fibonacci number._

__Solution:__

````Java
public static int fibbonachi(int n5){
        if (n5 <= 1) {
            return n5; // if it's the 0 or the first element of sequence result will be 1
        }
        return fibbonachi(n5 -1) + fibbonachi(n5-2); //function where we define every element of the sequence till we find the n-th element
    }
````

### Task 6

__Description:__ _Define a power to n_

__Explanation:__ _This function takes two integers a and n as input and calculates the value of a raised to the power of n. It does this using recursion to repeatedly multiply a by itself n times until it reaches the base case of n = 0, at which point it returns 1._

__Solution:__ __

````Java
 public static int powerof(int a, int n){
        if (n==1){ // if the power equals 1, then number will stay
            return a; //display the number without changing
        }
        return a * powerof(a, n-1); //calculate the a power to b, by multiplying it till the amount of it will be equal n
    }
````

### Task 7

__Description:__ _Given the n - lenght of array, and program will return given array in reverse order_

__Explanation:__ _This function takes two parameters, an integer i and an array of integers arr7. It recursively prints the elements of the array in reverse order by first calling itself with i + 1 and then printing the i-th element of the array._

__Solution:__

````Java
public static void reverseorder(int n7, int[] arr7){
        if (n7 == arr7.length) {
            return; //stops the recursive call
        }
        reverseorder(n7+1, arr7); //recursive call, where we start from the end
        System.out.println(arr7[n7]); //displays the array in reverse order
    }
````

### Task 8

__Description:__ _Define if whether a string "s" is all consist of digits_

__Explanation:__ _This function takes a string s as input and calculates the sum of the digits in the string. It does this by iterating over each character in the string, checking if it is a digit, and adding it to a running total if it is. Then, it returns the total sum of digits._

__Solution:__ 

````Java
public static boolean digits(String s){
        if (s.length() == 1){ //situation if we have string consisting only of 1 element
            return Character.isDigit(s.charAt(0)); //show if the element is digit or not
        }
        else{
            return Character.isDigit(s.charAt(0)) && digits(s.substring(1)); //checks every element if it is digit or not
        }
    }
````

### Task 9

__Description:__ _Find the binomial coefficient with values "n" and "k"_

__Explanation:__ _The function checks if either k9 is equal to 0 or k9 is equal to n9. If either of these conditions are true, the function returns 1. If neither condition is true, the function makes two recursive calls to binom. In the first call, n9 and k9 are both decremented by 1. In the second call, only n9 is decremented by 1. The function then returns the sum of the results of these two recursive calls._

__Solution:__

````Java
 public static int binom(int n9, int k9){
        if(k9 == 0|| k9 == n9) //condition if k9 = 0 or k9 = n9, and if condition is met it gives the result equal 1
            return 1; // result = 1
        return binom(n9-1, k9-1) + binom(n9-1, k9); // calculate binom of two numbers using recursive call
    }
````

### Task 10

__Description:__ _Finding the GCD of two numbers, "a" and "b"_

__Explanation:__ _Firstly, if any of two numbers are equal to zero it will return the other number, else it divides the remainder of dividing the first and second number by the second number so we will fint the Greatest Common Divider_

__Solution:__

````Java
 public static int GCD(int a10, int b10){
        if (b10 == 0) // condition, where second number = 0
            return a10; // if condition is met it will return the other number
        else
            return GCD(b10, a10%b10); // divides the remainder of dividing the first and second number by the second number
    }
}
````