import java.util.Scanner;

public class GrassHopperonLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(x%k!=0){
                System.out.println(1);
                System.out.println(x);
            }else{
                System.out.println(2);
                System.out.print(x-(k+1)+" ");
                System.out.println(k+1);
            }
        }
        sc.close();
    }
}
