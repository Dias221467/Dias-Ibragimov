import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Choose which task you want to try:");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Write the amount of numbers of array:");
                int n = scanner.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i<n; i++){
                    arr[i] = scanner.nextInt();
                }
                System.out.println(find_minimum(n, arr));
                break;
        }
    }
    public static int find_minimum(int n, int[] arr){
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
