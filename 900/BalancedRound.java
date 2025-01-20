import java.io.*;
import java.util.*;

public class BalancedRound {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int t = Integer.parseInt(br.readLine()); // Number of test cases
    while (t-- > 0) {
      String[] nk = br.readLine().split(" ");
      long n = Long.parseLong(nk[0]); // Number of problems
      long k = Long.parseLong(nk[1]); // Maximum allowed absolute difference
      String[] arrStr = br.readLine().split(" ");
      long[] arr = new long[(int) n];
      for (int i = 0; i < n; i++) {
        arr[i] = Long.parseLong(arrStr[i]);
      }
      Arrays.sort(arr); // Sort the array
      long maxCount = -1; // To store the maximum size of a balanced round
      long currentCount = 1; // To keep track of the current sequence
      for (int i = 1; i < n; i++) {
        if (arr[i] - arr[i - 1] <= k) {
          currentCount++; // Extend the balanced round
        } else {
          maxCount = Math.max(maxCount, currentCount);
          currentCount = 1; // Reset for the next sequence
        }
        }
      // Ensure the last sequence is also considered
       maxCount = Math.max(maxCount, currentCount);
      // Calculate the minimum number of problems to remove
      long toRemove = n - maxCount;
      out.println(toRemove);
        }
        out.flush();
        out.close();
    }
}