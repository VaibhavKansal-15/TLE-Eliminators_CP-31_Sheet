import java.util.*;
public class MainakandArray{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      if (n == 1) {
        System.out.println(0);
        continue;
      }
      
      int maxDiff=Integer.MIN_VALUE;
      for(int i=1;i<n;i++){
        maxDiff=Math.max(maxDiff,arr[i]-arr[0]);
      }

      for(int i=0;i<n-1;i++){
        maxDiff=Math.max(maxDiff,arr[n-1]-arr[i]);
      }

      for(int i=0;i<n-1;i++){
        maxDiff=Math.max(maxDiff,arr[i]-arr[i+1]);
      }
      System.out.println(maxDiff);
    }
    sc.close();
  }
}