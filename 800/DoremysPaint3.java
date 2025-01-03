import java.util.*;
public class DoremysPaint3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            //int[] arr=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                map.put(num,map.getOrDefault(num, 0)+1);
            }
            if(map.size()>2){
                System.out.println("NO");
            }else if(map.size()==1){
                System.out.println("YES");
            }else{
                int count1=0,count2=0;
                for(int value:map.values()){
                    if(count1==0){
                        count1=value;
                    }else{
                        count2=value;
                    }
                }

                if(Math.abs(count1-count2)<=1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
