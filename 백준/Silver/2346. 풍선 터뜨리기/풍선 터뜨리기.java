import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        Deque<Balloon> dp = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dp.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
        }

        while (!dp.isEmpty()) {
            Balloon balloon = dp.poll();
            sb.append(balloon.num).append(" ");
            if (dp.isEmpty()) break;
            if (balloon.paper > 0) {
                for (int i = 0; i < balloon.paper - 1; i++) {
                    dp.offer(dp.poll());
                }
            } else {
                for (int i = 0; i < Math.abs(balloon.paper); i++) {
                    dp.offerFirst(dp.pollLast());
                }
            }
        }
        System.out.println(sb);
    }

    static class Balloon {
        int num;
        int paper;

        public Balloon(int num, int paper) {
            this.num = num;
            this.paper = paper;
        }
    }
}