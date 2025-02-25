import java.util.*;

public class MochaAndMath {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int count=sc.nextInt();
      for(int i=1;i<n;i++){
        count&=sc.nextInt();
      }
      System.out.println(count);
    }
    sc.close();
  }
}
