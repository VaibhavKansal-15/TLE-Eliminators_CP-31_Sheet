import java.util.*;

public class UnitArray {
    public static boolean isOdd(int n){
        return n%2!=0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                count+=arr[i];
            }
            int f1=0,f2=0;
            for(int i=0;i<n;i++){
                if(arr[i]==-1){
                    f1++;
                }else{
                    f2++;
                }
            }   
            if(f1<=f2){
                if(isOdd(f1)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                count=f1-(n/2);
                if(isOdd(n/2)){
                    count++;
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
