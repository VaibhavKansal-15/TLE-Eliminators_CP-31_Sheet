import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            List<Long> arr1 = new ArrayList<>();
            for(int i=0;i<n;i++){
                arr1.add(sc.nextLong());
            }
            List<Long> arr2 = new ArrayList<>();
            arr2.add(arr1.get(0));

            for(int i=1;i<n;i++){
                if(arr1.get(i-1)>arr1.get(i)){
                    arr2.add(arr1.get(i));
                    arr2.add(arr1.get(i));
                }else{
                    arr2.add(arr1.get(i));
                }
            }
            System.out.println(arr2.size());
            for(long num:arr2){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
