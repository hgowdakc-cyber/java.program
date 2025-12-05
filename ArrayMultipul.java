import java.util.Scanner;

public class ArrayMultipul {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = SC.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = SC.nextInt();
        }

        printMultiples(arr);
    }

    public static void printMultiples(int arr[]) {
        int count = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                count++;
            }
        }
        System.out.println("Count of multiples of 3: " + count);
    }
}
