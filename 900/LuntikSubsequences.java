import java.util.Scanner;

public class LuntikSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int cnt0 = 0, cnt1 = 0;

            for (int i = 0; i < n; i++) {
                int ai = sc.nextInt();
                if (ai == 1) cnt1++;
                if (ai == 0) cnt0++;
            }

            System.out.println((1L << cnt0) * cnt1);
        }
        sc.close();
    }
}
