import java.util.*;
public class CoverinWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0;
            int count=0;
            for(int i=0;i<n-2;i++){
                if(s.substring(i,i+3).equals("...")){
                    ans=2;
                    break;
                }
            }
            if(ans==0){
                for(char c:s.toCharArray()){
                    if(c=='.'){
                        count++;
                    }
                }
                System.out.println(count);
            }else{
            System.out.println(ans);
            }
        }    
        sc.close();
    }   
}