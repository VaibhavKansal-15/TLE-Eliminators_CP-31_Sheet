import java.util.*;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int count = 0;
            while (count < 8) {
                if (x.contains(s)) {
                    break;
                }
                x += x;
                count++;
            }
            if (count == 8) count = -1;
            System.out.println(count);
        }
        sc.close();
    }
}