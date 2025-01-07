import java.util.*;
public class ArrayColoring {
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
            if(count%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
