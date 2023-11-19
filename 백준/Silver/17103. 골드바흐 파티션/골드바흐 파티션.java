import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        makePrimeList(1000001);

        for (int i = 0; i < n; i++) {
             int a = Integer.parseInt(br.readLine());
             int cnt = goldbach(a);
             sb.append(cnt).append("\n");
        }
        System.out.print(sb.toString());
    }
    static int goldbach(int a) {
        int cnt = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (!prime[i] && !prime[a - i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void makePrimeList(int end) {
        prime = new boolean[end + 1];
        if (end <= 1) {
            return;
        }
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(end); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j <= end; j += i) {
                prime[j] = true;
            }
        }
    }
}
