import java.util.*;
public class ArrayCloningTechnique{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int[] arr=new int[n];
      Map<Integer,Integer> map=new HashMap<>();
      int maxFreq=0;

      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        maxFreq=Math.max(maxFreq,map.get(arr[i]));
      }

      int count=0;
      int copies=maxFreq;

      while(copies<n){
        int add=Math.min(copies,n-copies);
        count+=1+add;
        copies+=add;
      }
      System.out.println(count);
    }
    sc.close();
  }
}