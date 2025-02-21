import java.io.*;
import java.util.*;

public class BalancedRound {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine());
    while (t-- > 0) {
      String[] nk = br.readLine().split(" ");
      long n = Long.parseLong(nk[0]);
      long k = Long.parseLong(nk[1]);
      String[] arrStr = br.readLine().split(" ");
      long[] arr = new long[(int) n];
      for (int i = 0; i < n; i++) {
        arr[i] = Long.parseLong(arrStr[i]);
      }
      Arrays.sort(arr); 
      long maxCount = -1; 
      long currentCount = 1; 
      for (int i = 1; i < n; i++) {
        if (arr[i] - arr[i - 1] <= k) {
          currentCount++;
        } else {
          maxCount = Math.max(maxCount, currentCount);
          currentCount = 1;
        }
        }
       maxCount = Math.max(maxCount, currentCount);
      long toRemove = n - maxCount;
      out.println(toRemove);
        }
        out.flush();
        out.close();
    }
}
