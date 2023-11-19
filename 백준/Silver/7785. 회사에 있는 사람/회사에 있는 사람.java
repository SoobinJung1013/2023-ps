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

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            if (status.equals("enter")) {
                map.put(name, 1);
            } else {
                map.remove(name);
            }
        }

        // sort map
        Object[] keySet = map.keySet().toArray();
        Arrays.sort(keySet);
        for (int i = keySet.length - 1; i >= 0; i--) {
            System.out.println(keySet[i]);
        }
    }
}