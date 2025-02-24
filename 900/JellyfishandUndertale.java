import java.util.*;

public class JellyfishandUndertale {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); 
    for (int tcase = 1; tcase <= t; tcase++) {
        long a = sc.nextLong();
        long b = sc.nextLong(); 
        long n = sc.nextLong(); 
        long ans = b - 1; 
        for (int i = 0; i < n; i++) {
            long ai = sc.nextLong();
            if (ai <= a - 1) {
                ans += ai;
            } else {
                ans += a - 1;
            }
        }
        ans++; 
        System.out.println(ans);
    }
    sc.close();
  }
}
