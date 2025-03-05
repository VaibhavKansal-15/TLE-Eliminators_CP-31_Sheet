import java.io.*;

public class OneandTwo {
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
            int id = -2;
            for (int i = 0; i < n - 1; i++) {
                int p1 = 0, p2 = 0;
                for (int j = 0; j <= i; j++) {
                    if (a[j] == 2) {
                        p1++;
                    }
                }
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == 2) {
                        p2++;
                    }
                }
                if (p1 == p2) {
                    id = i;
                    break;
                }
            }
            pw.println(id + 1);
        }
        pw.close();
    }
}
