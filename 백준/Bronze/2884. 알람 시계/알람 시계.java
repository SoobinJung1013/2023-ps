import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int h = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        if (m >= 45) {
            System.out.println(h + " " + (m - 45));
        } else {
            // 60 - (45 - m)
            if (h == 0) {
                System.out.println(23 + " " + (m + 15));
            } else {
                System.out.println((h - 1) + " " + (m + 15));
            }
        }
    }
}