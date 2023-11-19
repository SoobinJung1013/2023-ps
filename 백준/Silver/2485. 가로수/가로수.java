import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] width = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            width[i] = arr[i+1] - arr[i];
        }

        int gcd = 0;
        for (int i = 0; i < n - 2; i++) {
            if (i == 0) gcd = gcd(width[i], width[i+1]);
            else gcd = gcd(gcd, width[i+1]);
        }

        int cnt = 0;
        for (int i = 0; i < n-1; i++) {
            cnt += (width[i] / gcd) - 1;
        }
        System.out.println(cnt);
    }
    static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
}
