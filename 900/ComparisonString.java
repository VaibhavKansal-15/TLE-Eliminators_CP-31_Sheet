import java.util.*;
public class ComparisonString {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      String s=sc.next();

      int ans=1;
      int count=1;
      for(int i=1;i<n;i++){
        if(s.charAt(i)==s.charAt(i-1)){
          count++;
        }else{
          ans=Math.max(ans,count+1);
          count=1;
        }
      }
      ans=Math.max(ans,count+1);
      System.out.println(ans);
    }
    sc.close();
  }
}
