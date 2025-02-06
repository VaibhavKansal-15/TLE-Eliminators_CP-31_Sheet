import java.util.*;
public class ZeroOneGame {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      String s=sc.next();
      int count0=0,count1=0;
      for(char ch:s.toCharArray()){
        if(ch=='0'){
          count0++;
        }else{
          count1++;
        }
      }  
      int answer=Math.min(count0,count1);
      if(answer%2==1){
        System.out.println("DA");
      }else{
        System.out.println("NET");
      }
    }
    sc.close();
  }
}
