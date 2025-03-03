import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of boxes
            int k = sc.nextInt(); // Maximum subarray length for reversal
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            // Case 1: If k >= 2, always possible to sort
            if (k >= 2) {
                System.out.println("YES");
                continue;
            }
            // Case 2: If k == 1, check if the array is already sorted
            boolean isSorted = true;
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
