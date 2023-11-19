import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hs = new HashSet<String>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            hs.add(st.nextToken());
        }

        HashSet<String> hs2 = new HashSet<String>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            hs2.add(st.nextToken());
        }

        HashSet<String> hs3 = new HashSet<String>();
        // hs - hs2
        for (String s : hs) {
            if (!hs2.contains(s)) {
                hs3.add(s);
            }
        }

        HashSet<String> hs4 = new HashSet<String>();
        // hs2 - hs
        for (String s : hs2) {
            if (!hs.contains(s)) {
                hs4.add(s);
            }
        }

        System.out.println(hs3.size() + hs4.size());

    }
}
