import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose which option you want to try:");
        System.out.println("1 - minimum\n2 - average\n3- prime numbers\n4 - find n!\n5 - Fibonacci number\n6 - a power n\n7 - reverse order");
        System.out.println("8 - digits\n9 - binomical coefficient");
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
        }
    }
    public static int find_minimum(int n1, int[] arr){
        int min = arr[0];
        for (int i = 1; i < n1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int find_average(int n2, int[] arr2){
        int total = 0;
        for(int i = 0; i<n2; i++){
            total= arr2[i] + total;
        }
        return total/n2;
    }
    public static String define_prime_number(int n3){
       int count = 0;
       for (int i = 1; i < n3; i++){
           if(n3%i == 0){
               count = count + 1;
           }
       }
       if (count >= 2){
           return "Composite";
       }
       else{
           return "Prime";
       }
    }
    public static int factorial(int n4){
        if(n4 == 1)
            return 1;
        return n4 * factorial(n4-1);
    }
    public static int fibbonachi(int n5){
        if (n5 <= 1) {
            return n5;
        }
        return fibbonachi(n5 -1) + fibbonachi(n5-2);
    }
    public static int powerof(int a, int n){
        if (n==1){
            return a;
        }
        return a * powerof(a, n-1);
    }
    public static void reverseorder(int n7, int[] arr7){
        if (n7 == arr7.length) {
            return;
        }
        reverseorder(n7+1, arr7);
        System.out.println(arr7[n7]);
    }
    public static boolean digits(String s){
        if (s.length() == 1){
            return Character.isDigit(s.charAt(0));
        }
        else{
            return Character.isDigit(s.charAt(0)) && digits(s.substring(1));
        }
    }
    public static int binom(int n9, int k9){
        if(k9 == 0|| k9 == n9)
            return 1;
        return binom(n9-1, k9-1) + binom(n9-1, k9);
    }
}