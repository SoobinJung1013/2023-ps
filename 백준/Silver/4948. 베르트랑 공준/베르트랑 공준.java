import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.math.BigInteger;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        while (n != 0) {

            int cnt = primeFactors(n, 2*n);

            sb.append(cnt).append("\n");
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
        }

        System.out.print(sb.toString());

    }
    static int primeFactors(int start, int end)
    {
        int cnt = 0;
        for (int i = start + 1; i <= end; i++) {
            if (isPrime(i))
                cnt++;
        }
        return cnt;
    }
    static boolean isPrime(int a) {
        if (a == 1) return false;
        if (a == 2) return true;
        if (a % 2 == 0) return false;
        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
