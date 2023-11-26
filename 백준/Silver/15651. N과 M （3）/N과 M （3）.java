import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        backtracting(0);

        System.out.println(sb);
    }

    public static void backtracting(int level) {
        // 종료 조건
        if (level == M) {
            for (int value : arr) {
                sb.append(value).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 가지치기
        for (int i = 1; i <= N; i++) {
            arr[level] = i;
            backtracting(level + 1);
        }
    }
}