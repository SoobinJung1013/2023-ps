import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int min = 0;

        for (int i = 0; i < n; i++) {
            String s = String.valueOf(i);
            int temp = i;
            for (int j = 0; j < s.length(); j++) {
                temp += s.charAt(j) - '0';
            }
            if (temp == n) {
                min = i;
                break;
            }
        }
        System.out.println(min);
    }
}
