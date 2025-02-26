import java.util.Scanner;

public class OddDivisor {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long n=sc.nextLong();
      if(n%2!=0 || !isPower(n)){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
    sc.close();
  }
  private static boolean isPower(long n){
    return (n & (n-1))==0;
  }
}
