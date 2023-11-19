import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        System.out.println(x*y / gcd(x, y));

    }
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
