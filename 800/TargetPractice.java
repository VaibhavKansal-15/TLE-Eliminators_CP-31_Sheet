import java.io.*;

public class TargetPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        int t = Integer.parseInt(br.readLine().trim());

        for (int tcase = 1; tcase <= t; tcase++) {
            int answer = 0;

            for (int i = 0; i < 10; i++) {
                String str = br.readLine();
                for (int j = 0; j < 10; j++) {
                    if (str.charAt(j) == 'X') {
                        answer += arr[i][j];
                    }
                }
            }

            System.out.println(answer);
        }
    }
}
