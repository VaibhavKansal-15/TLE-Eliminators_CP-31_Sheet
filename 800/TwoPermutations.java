import java.util.Scanner;

public class TwoPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (n == a && a == b) {
                System.out.println("Yes");
            } else {
                if (n - (a + b) >= 2) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}
