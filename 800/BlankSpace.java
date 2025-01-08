import java.util.*;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int count=0;
            int maxCount=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    count++;
                }else{
                    maxCount=Math.max(maxCount,count);
                    count=0;
                }
            }
            maxCount=Math.max(maxCount,count);
            System.out.println(maxCount);
        }
        sc.close();
    }
}
