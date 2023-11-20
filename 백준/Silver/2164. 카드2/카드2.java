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

        boolean type = true; // true : 버림, false : 뒤로 옮김
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            q.add(i);
        }

        while(q.size() > 1) {
            if(type) {
                q.poll();
                type = false;
            } else {
                q.add(q.poll());
                type = true;
            }
        }
        System.out.println(q.poll());
    }
}
