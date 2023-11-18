import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long e = Long.parseLong(st.nextToken());
        long f = Long.parseLong(st.nextToken());

        long x;
        long y;
        if ((b * d - a * e) == 0 || a == 0) {
            x = (c * e - b * f) / (a * e - b * d);
            y = (c - a * x) / b;
        } else {
            y = (d * c - a * f) / (b * d - a * e);
            x = (c - b * y) / a;
        }
        System.out.println(x + " " + y);
    }
}
