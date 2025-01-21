import java.io.*;
import java.util.*;

public class OddQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;

        // Number of test cases
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // Size of the array
            int q = Integer.parseInt(st.nextToken()); // Number of queries

            // Input array
            long[] v = new long[n];
            long[] p = new long[n]; // Prefix sum array
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                v[i] = Long.parseLong(st.nextToken());
                p[i] = v[i] + (i > 0 ? p[i - 1] : 0);
            }

            // Total sum of the array
            long ans = Arrays.stream(v).sum();

            // Process each query
            while (q-- > 0) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                long k = Long.parseLong(st.nextToken());

                long sum;
                int nn = r - l + 1;
                l--; r--;

                if (l == 0) {
                    sum = p[r];
                } else {
                    sum = p[r] - p[l - 1];
                }

                // Calculate the modified sum
                long xx = ans - sum + (nn * k);

                // Check if the sum is odd or even
                if (xx % 2 != 0) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            }
        }

        out.close();
    }
}
