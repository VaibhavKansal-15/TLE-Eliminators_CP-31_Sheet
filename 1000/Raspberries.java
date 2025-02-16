import java.util.Scanner;

public class Raspberries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int md = 0, even = 0;
            boolean div = false;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                x %= k;

                if (x > 0) {
                    md = Math.max(md, x);
                } else {
                    div = true;
                }
                if (x == 2) {
                    even++;
                }
            }

            if (div) {
                System.out.println(0);
            } else if (k == 4) {
                if (even >= 2) {
                    System.out.println(0);
                } else if (even >= 1 || md == 3) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(k - md);
            }
        }

        sc.close();
    }
}