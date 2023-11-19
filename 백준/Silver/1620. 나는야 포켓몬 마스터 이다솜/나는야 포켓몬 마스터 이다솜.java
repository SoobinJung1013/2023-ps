import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 포케몬 개수
        int m = Integer.parseInt(st.nextToken()); // 문제 개수

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map.put(name, i);
            map2.put(i, name);
        }
        for (int i = 0; i < m; i++) {
            String question = br.readLine();
            if (Character.isDigit(question.charAt(0))) {
                System.out.println(map2.get(Integer.parseInt(question)));
            } else {
                System.out.println(map.get(question));
            }
        }
    }
}
