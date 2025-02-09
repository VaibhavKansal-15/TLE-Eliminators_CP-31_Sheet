import java.util.*;
import java.io.*;
public class MakeitZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            long n = sc.nextLong(); 
            int[] arr = new int[(int) n];
            for (long i = 0; i < n; i++) {
                arr[(int) i] = sc.nextInt(); 
            }
            if (n % 2 == 0) {
                System.out.println(2);
                System.out.println("1 " + n);
                System.out.println("1 " + n);
            } else {
                System.out.println(4);
                System.out.println("1 " + n);
                System.out.println("2 " + n);
                System.out.println("1 2");
                System.out.println("1 2");
            }
        }
        sc.close();
    }
}
