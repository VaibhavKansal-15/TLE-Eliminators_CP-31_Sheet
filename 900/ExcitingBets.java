import java.util.*;

public class ExcitingBets {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long a=sc.nextLong();
      long b=sc.nextLong();
      if(a==b){
        System.out.println("0 0");
      }else{
        long gcd=Math.abs(a-b);
        long moves = Math.min(a % gcd, gcd - (a % gcd));
        System.out.println(gcd+" "+moves);
      }
    }
    sc.close();
  }
}
