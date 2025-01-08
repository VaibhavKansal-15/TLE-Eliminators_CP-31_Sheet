import java.util.*;

public class TwinPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                int sum=n+1;
                sum-=arr[i];
                list.add(sum);
            }
            for(int i:list){
                System.out.print(i+" ");
            }    
            System.out.println();
        }
        sc.close();
    }
}
