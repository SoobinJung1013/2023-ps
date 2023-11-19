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

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            if (Parsing(st.nextToken()))
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }

        System.out.println(sb);
    }

    public static boolean Parsing(String s) {
        // parsing 잘되면 true, 안되면 false
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 여는 괄호면 스택에 넣기
            if (c == '(') {
                stack.push(c);
            }
            // 닫는 괄호면 스택에서 빼기
            else {
                // 스택이 비어있으면 false
                if (stack.isEmpty()) {
                    return false;
                }
                // 스택에서 여는 괄호 빼기
                else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
