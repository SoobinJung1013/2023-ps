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
        HashSet<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<m; i++) {
            if (set.contains(Integer.parseInt(st.nextToken()))) {
                arr2[i] = 1;
            } else {
                arr2[i] = 0;
            }
        }

        for (int i=0; i<m; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}