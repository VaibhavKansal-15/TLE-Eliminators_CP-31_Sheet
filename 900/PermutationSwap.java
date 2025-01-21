import java.util.*;
public class PermutationSwap {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int[] arr=new int[n];
      int[] newArr=new int[n+1];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        newArr[arr[i]]=i;
      }
      List<Integer> differences=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(arr[i]!=i+1){
          differences.add(Math.abs(newArr[i+1]-i));
        }
      }
      int gcdResult=differences.get(0);
      for(int diff :differences){
        gcdResult=gcd(gcdResult,diff);
      }
      System.out.println(gcdResult);
    }
    sc.close();
  }
  private static int gcd(int a,int b){
    while(b!=0){
      int temp=b;
      b=a%b;
      a=temp;
    }
    return a;
  }
}
