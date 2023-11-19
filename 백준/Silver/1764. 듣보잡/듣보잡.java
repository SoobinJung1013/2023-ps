import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람의 수
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람의 수

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map.put(name, 1);
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (map.containsKey(name)) {
                result.add(name);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
//        String [] arr = new String[count];
//        for (int i = 0; i < count; i++) {
//            arr[i] = sb.toString().split("\n")[i];
//            System.out.println(arr[i]);
//        }

//        Arrays.sort(arr);
//        System.out.println(count);
//        for (int i = 0; i < count; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
