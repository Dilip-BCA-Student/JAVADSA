public class firstRepeat {
    static int repeatFirst(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];

                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 7, 9, 8, 4, 5 };
        int rs = repeatFirst(arr);
        System.out.println(rs);

    }
}
