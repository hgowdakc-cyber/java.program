import java.util.*;

public class SumOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		int arr[][] = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the value of row" + (i + 1) + "cloumn" + (j + 1));
				arr[i][j] = SC.nextInt();
				

			}
		}
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum +arr[i][j];
			}
				System.out.println();
			
	}
		System.out.println("the sum of array is:"+sum);

}

}