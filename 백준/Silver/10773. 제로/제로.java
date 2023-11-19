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

        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(br.readLine());
        while (k-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
