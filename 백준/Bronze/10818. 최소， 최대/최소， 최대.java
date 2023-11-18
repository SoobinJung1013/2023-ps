import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int min = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (i == 0) {
                max = a;
                min = a;
            } else {
                if (a > max) {
                    max = a;
                }
                if (a < min) {
                    min = a;
                }
            }
        }
        System.out.println(min + " " + max);
    }
}
