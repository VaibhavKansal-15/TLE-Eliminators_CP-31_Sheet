import java.io.*;
import java.util.*;

public class MakeitBeautiful {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(input[i]);
            }
            Arrays.sort(a);
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    count++;
                }
            }  
            if (count == n) {
                pw.println("NO");
            } else {
                pw.println("YES");
                pw.print(a[n - 1] + " " + a[0] + " ");
                for (int i = 1; i < n - 1; i++) {
                    pw.print(a[i] + " ");
                }
                pw.println();
            }
        }
        pw.close();
    }
}
