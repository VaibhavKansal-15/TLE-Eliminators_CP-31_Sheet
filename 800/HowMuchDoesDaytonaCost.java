import java.util.Scanner;

public class HowMuchDoesDaytonaCost{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            boolean found=false;
            for(long i=0;i<n;i++){
                long num=sc.nextLong();
                if(num==k){
                    found=true;
                }
            }
            if(found){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
