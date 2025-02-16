import java.util.Scanner;

public class SwapAndDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            int zero = 0, one = 0;
            
            for (char c : str.toCharArray()) {
                if (c == '0') zero++;
                else one++;
            }

            for (char c : str.toCharArray()) {
                if (c == '0') {
                    if (one > 0) one--;
                    else break;
                } else {
                    if (zero > 0) zero--;
                    else break;
                }
            }

            System.out.println(zero + one);
        }
        sc.close();
    }
}
