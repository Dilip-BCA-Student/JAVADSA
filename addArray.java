import java.util.*;

public class addArray {

    static void printArray(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

    public static void main(String args[]) {
        int ar1[][] = { { 2, 4, 6 }, { 4, 3, 7 } };
        int ar2[][] = { { 1, 5, 5 }, { 9, 6, 8 } };
        int sum[][] = new int[2][3];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        System.out.println("First Array:\n");
        printArray(ar1);
        System.out.println("Second Array:\n");

        printArray(ar2);
        System.out.println("Sum of both above Array in below \n");

        printArray(sum);

    }
}
