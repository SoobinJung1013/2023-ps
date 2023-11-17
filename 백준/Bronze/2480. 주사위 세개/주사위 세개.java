import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        if (n == m && m == k) {
            System.out.println(10000 + n * 1000);
        } else if (n == m || n == k || m == k) {
            System.out.println(1000 + (n == m ? n : k) * 100);
        } else {
            System.out.println(Math.max(Math.max(n, m), k) * 100);
        }
    }
}