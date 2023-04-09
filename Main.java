import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose which option you want to try:");
        System.out.println("1 - minimum\n2 - average\n3- prime numbers\n4 - find n!\n5 - Fibonacci number\n6 - a power n\n7 - reverse order");
        System.out.println("8 - digits\n9 - binomical coefficient\n10 - Find GCD of two numbers");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Write the amount of numbers of array:");
                int n1 = scanner.nextInt();
                int[] arr = new int[n1];
                System.out.println("Write the numbers of array:");
                for (int i = 0; i<n1; i++){
                    arr[i] = scanner.nextInt();
                }
                System.out.println(find_minimum(n1, arr));
                break;
            case 2:
                System.out.println("Write the amount of numbers of array:");
                int n2 = scanner.nextInt();
                int[] arr2 = new int[n2];
                System.out.println("Write the numbers of array:");
                for (int i2 = 0; i2<n2; i2++){
                    arr2[i2] = scanner.nextInt();
                }
                System.out.println(find_average(n2, arr2));
                break;
            case 3:
                System.out.println("Write some number:");
                int n3 = scanner.nextInt();
                System.out.println(define_prime_number(n3));
                break;
            case 4:
                System.out.println("Write some number:");
                int n4 = scanner.nextInt();
                System.out.println(factorial(n4));
                break;
            case 5:
                System.out.println("Write some number:");
                int n5 = scanner.nextInt();
                System.out.println(fibbonachi(n5));
                break;
            case 6:
                System.out.println("Write number a:");
                int a = scanner.nextInt();
                System.out.println("Write power:");
                int n = scanner.nextInt();
                System.out.println(powerof(a, n));
                break;
            case 7:
                System.out.println("Write the amount of numbers of array:");
                int n7 = scanner.nextInt();
                int[] arr7 = new int[n7];
                System.out.println("Write the numbers of array:");
                for (int i = 0; i<n7; i++){
                    arr7[i] = scanner.nextInt();
                }
                reverseorder(0, arr7);
                break;
            case 8:
                System.out.println("Write a string s:");
                String s = scanner.next();
                System.out.println(digits(s));
                break;
            case 9:
                System.out.println("Write two numbers to calculate:\nn:");
                int n9 = scanner.nextInt();
                System.out.println("k:");
                int k9 = scanner.nextInt();
                System.out.println(binom(n9, k9));
                break;
            case 10:
                System.out.println("Write two numbers a and b\na:");
                int a10 = scanner.nextInt();
                System.out.println("b:");
                int b10 = scanner.nextInt();
                System.out.println(GCD(a10, b10));
                break;
        }
    }
    /*
    @find_minimum - display the min
    @n1 - length of array
    @arr - array
    @min - define the min
     */
    public static int find_minimum(int n1, int[] arr){
        int min = arr[0]; //define the first element as the min
        for (int i = 1; i < n1; i++) {
            if (arr[i] < min) { //compare other numbers with min
                min = arr[i];
            }
        }
        return min; // result the min of array
    }
    /*
    @find_average - display the average
    @total - sum of array
    @arr2 - array
    @n2 - length of array
    @return - give the result
     */
    public static int find_average(int n2, int[] arr2){
        int total = 0; //creating int total
        for(int i = 0; i<n2; i++){
            total= arr2[i] + total; //defining the total sum of numbers in array
        }
        return total/n2; // find the average of array
    }
    /*
    @define_prime_number - define is number prime or not
    @count - countdown the number that could be divider of number
    @n3 - number that need to be defined
     */
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
    /*
    @factorial - define the factorial of given number
    @n4 - number
    @return - show the result
     */
    public static int factorial(int n4){
        if(n4 == 1)
            return 1; // if the number is 1, factorial of this number will be 1
        return n4 * factorial(n4-1); // finding factorial through recursive call, by multiplying it numbers that lower then itself
    }
    /*
    @fibbonachi - define n-th element of fibonacci sequence
    @n5 - the element of fibonacci sequence
    @return - show the result
     */
    public static int fibbonachi(int n5){
        if (n5 <= 1) {
            return n5; // if it's the 0 or the first element of sequence result will be 1
        }
        return fibbonachi(n5 -1) + fibbonachi(n5-2); //function where we define every element of the sequence till we find the n-th element
    }
    /*
    @powerof - define the a to power n
    @a - number
    @n - power
    @return - result
     */
    public static int powerof(int a, int n){
        if (n==1){ // if the power equals 1, then number will stay
            return a; //display the number without changing
        }
        return a * powerof(a, n-1); //calculate the a power to b, by multiplying it till the amount of it will be equal n
    }
    /*
    @reverseorder - returns given array in reverse order
    @n7 - length of array
    @arr7 - array
     */
    public static void reverseorder(int n7, int[] arr7){
        if (n7 == arr7.length) {
            return; //stops the recursive call
        }
        reverseorder(n7+1, arr7); //recursive call, where we start from the end
        System.out.println(arr7[n7]); //displays the array in reverse order
    }
    /*
    @digits - define if the string consist only of digits
    @s.length - the length of the string
    @Character.isDigit - define if character is digit
    @s.charAt() - choose the element of string
    @s.substring - move the choose of elements
     */
    public static boolean digits(String s){
        if (s.length() == 1){ //situation if we have string consisting only of 1 element
            return Character.isDigit(s.charAt(0)); //show if the element is digit or not
        }
        else{
            return Character.isDigit(s.charAt(0)) && digits(s.substring(1)); //checks every element if it is digit or not
        }
    }
    /*
    @binom - method that define the binom of numbers n and k
    @n9 - upper coefficient
    @k9 - down coefficient
    @return - result of method
     */
    public static int binom(int n9, int k9){
        if(k9 == 0|| k9 == n9) //condition if k9 = 0 or k9 = n9, and if condition is met it gives the result equal 1
            return 1; // result = 1
        return binom(n9-1, k9-1) + binom(n9-1, k9); // calculate binom of two numbers using recursive call
    }
    /*
    @GCD - define greatest common divider
    @a10 - first number
    @b10 - second number
    @return - result
     */
    public static int GCD(int a10, int b10){
        if (b10 == 0) // condition, where second number = 0
            return a10; // if condition is met it will return the other number
        else
            return GCD(b10, a10%b10); // divides the remainder of dividing the first and second number by the second number
    }
}