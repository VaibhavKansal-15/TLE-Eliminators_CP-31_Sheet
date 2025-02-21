import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chemistry {
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            String s = sc.next(); 
            Map<Character, Integer> freqMap = new HashMap<>();
            for (char ch : s.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
            int odds = 0;
            for (int freq : freqMap.values()) {
                if (isOdd(freq)) {
                    odds++;
                }
            }
            if (k < odds - 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
