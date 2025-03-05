import java.util.Scanner;

public class Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int left=0,right=n-1;
            while(left<right && s.charAt(left)!=s.charAt(right)){
                left++;
                right--;
            }
            System.out.println(right-left+1);
        }
        sc.close();
    }
}
