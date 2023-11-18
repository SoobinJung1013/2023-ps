import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int NUM = 10;
    public static int DIVIDER = 42;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[DIVIDER];
        int cnt = 0;

        for (int i = 1; i <= NUM; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int remain = a % DIVIDER;
            if (arr[remain] == 0) {
                cnt++;
                arr[remain] = 1;
            }
        }
        System.out.println(cnt);
    }
}
