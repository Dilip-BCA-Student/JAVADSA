import java.util.Scanner;
import java.util.Arrays;

public class returnArr {

    static int[] returnA(int arr[]) {
        Arrays.sort(arr);
        int[] arraycopy = new int[2];
        arraycopy[0] = arr[0];
        arraycopy[1] = arr[arr.length - 1];
        return (arraycopy);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter" + n + "Element for Array");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int rs[] = returnA(array);
        System.out.println("smallest and largest value of Array given below:");
        System.out.print(rs[0] + " ");
        System.out.print(rs[1]);

    }

}
