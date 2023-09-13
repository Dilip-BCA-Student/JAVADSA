
//find the unique number in a given array where all the element are repeated twice with one value being unique.

public class arraymanu {
    public static int unique(int arr[]) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int array[] = { 3, 1, 2, 4, 4, 5, 1, 2, 3 };
        System.out.println(unique(array));

    }
}
