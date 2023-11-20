import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        // N = 7
        // K = 3
        // 1 2 3 4 5 6 7
        // 1 2 4 5 6 7 : 3
        // 1 2 4 5 7 : 6
        // 1 4 5 7 : 2
        // 1 4 5 : 7
        // 1 4 : 5
        // 4 : 1
        //  : 4

        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        sb.append("<");
        while (!q.isEmpty()) {
            count++;
            if (count == K) {
                sb.append(q.poll());
                count = 0;
                if (!q.isEmpty()) {
                    sb.append(", ");
                }
            } else {
                q.add(q.poll());
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
