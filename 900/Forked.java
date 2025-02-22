import java.util.*;

public class Forked{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            int xk = sc.nextInt(); 
            int yk = sc.nextInt(); 
            int xq = sc.nextInt(); 
            int yq = sc.nextInt(); 
            int[] dx = {a, a, -a, -a, b, -b, b, -b};
            int[] dy = {b, -b, b, -b, a, a, -a, -a};
            int count = 0;
            Map<Integer, Set<Integer>> visited = new HashMap<>();
            for (int i = 0; i < 8; i++) {
                int xi = xk + dx[i];
                int yi = yk + dy[i];
                for (int j = 0; j < 8; j++) {
                    if (xi + dx[j] == xq && yi + dy[j] == yq) {
                        if (!visited.containsKey(xi)) {
                            visited.put(xi, new HashSet<>());
                        }
                        if (visited.get(xi).contains(yi)) {
                            continue;
                        }
                        visited.get(xi).add(yi);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
