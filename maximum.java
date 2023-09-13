import java.util.Scanner;

class Max {
    int returnMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    int secondMax(int array[]) {
        int mx = returnMax(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == mx) {
                array[i] = Integer.MIN_VALUE;
            }
        }
        int sm = returnMax(array);
        return sm;
    }
}

public class maximum {
    public static void main(String args[]) {
        Max obj = new Max();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter " + n + " array Elemen");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int rs = obj.secondMax(array);
        System.out.println("\nSecond Maximum in array=" + rs);

    }
}
