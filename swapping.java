import java.util.Scanner;

public class swapping {
    public static void swappNumber(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swapping");
        System.out.println("value of a = " + a + " and value of b = " + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int n = sc.nextInt();
        System.out.println("Enter Second Number:");
        int m = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.print("value of a= " + n + " and b = " + m);
        swappNumber(n, m);
        System.out.println("\nChange or not in main");
        System.out.print("value of a= " + n + " and b = " + m);

    }
}
