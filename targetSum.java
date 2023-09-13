import java.util.*;

class Target {
    public int Pairs(int arr[], int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; j < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }

            }
        }
        return ans;

    }
}

public class targetSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Target obj = new Target();
        System.out.println("Enter The size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter " + n + " Element");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter Target Sum");
        int t = sc.nextInt();
        int rs = obj.Pairs(array, t);
        System.out.println(" Triple pairs = " + rs);

    }
}
