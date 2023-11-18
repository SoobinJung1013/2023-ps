import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        long n = Integer.parseInt(reader.readLine());

        for ( int i = 1; i <= n; i++ ) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = a + b;
            System.out.println("Case #"+ i + ": " + a + " + " + b + " = " + c);
        }
    }
}