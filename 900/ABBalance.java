import java.util.Scanner;
public class ABBalance {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
      String s=sc.nextLine();
      int n=s.length();
      int abCount=0;
      int baCount=0;
      for(int i=0;i<n-1;i++){
        if(s.charAt(i)=='a' && s.charAt(i+1)=='b'){
          abCount++;
        }else if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
          baCount++;
        }
      }
      if(abCount==baCount){
        System.out.println(s);
        continue;
      }
      char[] chars=s.toCharArray();
      if(abCount>baCount){
        chars[n-1]='a';
      }else{
        chars[n-1]='b';
      }
      System.out.println(new String(chars));
    }
    sc.close();
  }
}
