
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = SC.nextInt();

        int[] arr = new int[n];
      
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = SC.nextInt();
        }

        System.out.print("Enter number to search: ");
        int Find = SC.nextInt();

        boolean found = false;

        for (int num : arr) {
            if (num == Find) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Number " + Find + " is present in the array.");
        else
            System.out.println("Number " + Find + " is NOT present in the array.");
    }
}