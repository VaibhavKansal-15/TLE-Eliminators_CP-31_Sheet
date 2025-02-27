import java.util.*;
import java.io.*;

public class SumofMedians {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n * k];
            for (int i = 0; i < n * k; i++) {
                a[i] = sc.nextInt();
            }
            int med = (int) Math.ceil(n / 2.0);
            int diff = med;
            if (n % 2 == 0) diff = med + 1;
            int cnt = 0;
            long ans = 0;
            for (int i = n * k - diff; cnt < k; i -= diff, ++cnt) {
                ans += a[i];
            }
            out.println(ans);
        }
        out.flush();
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
