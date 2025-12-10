package com.Acharya;
import java.util.Scanner;

public class CheckingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("Enter the  numbers:");
        for (int mat = 0; mat < 3; mat++) {
            for (int mat1 = 0; mat1 < 3; mat1++) {
                arr[mat][mat1] = sc.nextInt();
            }
        }

        int count1to50 = 0, count50to100 = 0, countAbove100 = 0;

        for (int mat = 0; mat < 3; mat++) {
            for (int mat1 = 0; mat1 < 3; mat1++) {
                if (arr[mat][mat1] >= 1 && arr[mat][mat1] <= 50) {
                    count1to50++;
                } else if (arr[mat][mat1] > 50 && arr[mat][mat1] <= 100) {
                    count50to100++;
                } else if (arr[mat][mat1] > 100) {
                    countAbove100++;
                }
            }
        }

        System.out.println("Numbers between 1 to 50: " + count1to50);
        System.out.println("Numbers between 50 to 100: " + count50to100);
        System.out.println("Numbers above 100: " + countAbove100);
    }
}