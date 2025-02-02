import java.util.Scanner;

public class StrangePartition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
    int n = sc.nextInt();
    long x = sc.nextLong();
    long sum = 0, maxBeauty = 0;
    for (int i = 0; i < n; i++) {
      long ai = sc.nextLong();
      sum += ai;
      maxBeauty += (ai + x - 1) / x; // Equivalent to ceil(ai / x)
    }
    long minBeauty = (sum + x - 1) / x; // Equivalent to ceil(sum / x)
    System.out.println(minBeauty + " " + maxBeauty);
    }  
    sc.close();
  }
}
