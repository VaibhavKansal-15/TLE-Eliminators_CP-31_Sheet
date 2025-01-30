import java.util.Scanner;

public class OddGrassHopper {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long x0=sc.nextLong();
      long n=sc.nextLong();
      long result;
      if(n%4==0){
        result=x0;
      }else if(n%4==1){
        result=(x0%2==0)? x0-n: x0+n;
      }else if(n%4==2){
        result=(x0%2==0)? x0+1: x0-1; 
      }else{
        result=(x0%2==0)? x0+(n+1) : x0-(n+1);
      }
      System.out.println(result);
    }
    sc.close();
  }
}
