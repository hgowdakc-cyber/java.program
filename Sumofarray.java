import java.util.Scanner;

public class Sumofarray {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = SC.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = SC.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array elements = " + sum);
    }
}