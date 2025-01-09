import java.util.Scanner;

public class WalkingMaster {
    public static int minMoves(int a,int b,int c,int d){
        int y=d-b;
        int x=a+(d-b)-c;
        if(x<0 || y<0){
            return -1;
        }else{
            return x+y;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();

            System.out.println(minMoves(a,b,c,d));
        }
        sc.close();
    }
}
