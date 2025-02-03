import java.util.Scanner;
public class DeletiveEditing {
    private static void answer(boolean v) {
        System.out.println(v ? "YES" : "NO");
    }
    private static void solve(String s, String t) {
        int[] f = new int[26];
        for (char c : t.toCharArray()) {
            f[c - 'A']++;
        }
        StringBuilder r = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (f[c - 'A']-- > 0) {
                r.append(c);
            }
        }
        answer(r.reverse().toString().equals(t));
    }
    private static void testCase(Scanner sc) {
        String s = sc.next();
        String t = sc.next();
        solve(s, t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            testCase(sc);
        }
        sc.close();
    }
}
