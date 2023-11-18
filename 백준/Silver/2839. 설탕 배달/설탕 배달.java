import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = Integer.MAX_VALUE;
        int x = 0;
        int y = 0;

        // 3x + 5y = n

        for (x = 0; x <= n / 3; x++) {
            // n - 3x = 5y
            if ((n - 3 * x) % 5 == 0) {
                y = (n - 3 * x) / 5;
                if (x + y < count) {
                    count = x + y;
                }
            }
        }
        if (count == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
