import java.util.*;

public class print2DArray {
    void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        print2DArray obj = new print2DArray();
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + "th row Element: \n");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        obj.printArray(arr);

    }
}
