import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int h = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(reader.readLine());

        if (m + k >= 60) {
            h += (m + k) / 60;
            m = (m + k) % 60;
        } else {
            m += k;
        }
        System.out.println(h % 24 + " " + m);
    }
}