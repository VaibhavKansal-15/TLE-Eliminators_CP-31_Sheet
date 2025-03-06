import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean allSame=true;
            for(int i=1;i<n;i++){
                if(arr[i]!=arr[0]){
                    allSame=false;
                    break;
                }
            }
            if(allSame){
                System.out.println(-1);
            }else{
                Arrays.sort(arr);
                List<Integer> b=new ArrayList<>();
                List<Integer> c=new ArrayList<>();
                b.add(arr[0]);
                for(int i=1;i<n;i++){
                    if(arr[i]==arr[0]){
                        b.add(arr[i]);
                    }else{
                        c.add(arr[i]);
                    }
                }
                System.out.println(b.size()+" "+c.size());
                for(int num:b){
                    System.out.print(num+" ");
                }
                System.out.println();
                for(int num:c){
                    System.out.print(num+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
