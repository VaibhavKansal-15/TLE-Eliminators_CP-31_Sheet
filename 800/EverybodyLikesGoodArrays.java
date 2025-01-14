import java.util.Scanner;

public class EverybodyLikesGoodArrays {
    public static boolean parity(int i){
        return i%2==0;
    }
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
            for(int i=1;i<n;i++){
                if(parity(arr[i])==parity(arr[i-1])){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }   
}
