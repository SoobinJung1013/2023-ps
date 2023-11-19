import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (command == 2) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
//                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            } else if (command == 3) {
                sb.append(stack.size()).append("\n");
//                System.out.println(stack.size());
            } else if (command == 4) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
//                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (command == 5) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
//                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
        System.out.println(sb);
    }
}
