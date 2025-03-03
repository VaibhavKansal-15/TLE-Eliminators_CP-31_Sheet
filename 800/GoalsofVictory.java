import java.util.*;

public class GoalsofVictory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            long count=0;
            long n=sc.nextLong();
            long[] arr=new long[(int)(n-1)];
            for(int i=0;i<n-1;i++){
                arr[(int)i]=sc.nextLong();
                count+=arr[(int)i];
            }
            long answer=-(count);
            System.out.println(answer);
        }
        sc.close();
    }
}
