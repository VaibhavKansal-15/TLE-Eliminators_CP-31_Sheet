import java.util.Scanner;

public class WeNeedtheZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean flag = false;
            
            for (int i = 0; i < (1 << 8); i++) {
                int ans = 0;
                for (int j = 0; j < n; j++) {
                    ans ^= arr[j] ^ i;
                }
                
                if (ans == 0) {
                    System.out.println(i);
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
