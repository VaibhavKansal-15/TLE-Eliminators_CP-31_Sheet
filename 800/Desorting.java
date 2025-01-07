import java.util.*;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            } 

            boolean bool=false;
            int mindiff=Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    bool=true;
                    break;
                }
                mindiff=Math.min(mindiff,arr[i+1]-arr[i]);
            }
            if(mindiff%2==0){
                mindiff=(mindiff)/2+1;
            }else{
                mindiff=(mindiff+1)/2;
            }

            if(bool){
                System.out.println(0);
            }else{
                System.out.println(mindiff);
            }
        }
        sc.close();
    }
}
