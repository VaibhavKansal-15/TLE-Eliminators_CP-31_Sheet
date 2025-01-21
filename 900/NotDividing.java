import java.util.Scanner;

public class NotDividing {
    public static void processTestCase(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 1) {
                arr[i]++; // Increment if element is 1
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] % arr[i] == 0) {
                arr[i + 1]++; // Increment to break divisibility
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            processTestCase(sc); // Pass the same Scanner instance
        }
        sc.close();
    }
}
