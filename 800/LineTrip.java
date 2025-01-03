import java.util.*;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int mn = Integer.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                mn = Math.max(mn, a[i] - a[i - 1]);
            }   
            System.out.println(Math.max(Math.max(a[0], 2 * (x - a[n - 1])), mn));
        }        
        sc.close();
    }
}
