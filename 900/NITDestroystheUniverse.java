import java.util.*;

public class NITDestroystheUniverse{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int groups=0;
      boolean inGroup=false;
      for(int i=0;i<n;i++){
        if(arr[i]!=0){
          if(!inGroup){
            groups++;
            inGroup=true;
          }
        }else{
          inGroup=false;
        }
      }
      if(groups==0){
        System.out.println(0);
      }else if(groups==1){
        System.out.println(1);
      }else{
        System.out.println(2);
      }
    }
    sc.close();
  }
}    
