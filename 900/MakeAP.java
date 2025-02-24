import java.util.Scanner;

public class Main {
    public static boolean canMakeAp(int a, int b, int c) {
        // Check if already AP
        if (2 * b == a + c) {
            return true;
        }
        // Check multiplying a by m
        if ((2 * b - c) % a == 0) {
            int m = (2 * b - c) / a;
            if (m > 0) {
                return true;
            }
        }
        // Check multiplying b by m
        if ((a + c) % (2 * b) == 0) {
            int m = (a + c) / (2 * b);
            if (m > 0) {
                return true;
            }
        }
        // Check multiplying c by m
        if ((2 * b - a) % c == 0) {
            int m = (2 * b - a) / c;
            if (m > 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (canMakeAp(a, b, c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
