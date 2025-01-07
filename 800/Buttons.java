import java.util.Scanner;
public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long annaButtons = a + (c + 1) / 2;
            long katieButtons = b + c / 2;
            if (annaButtons > katieButtons) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        sc.close();
    }
}