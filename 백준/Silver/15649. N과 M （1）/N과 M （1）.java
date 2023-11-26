
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int M;
    public static int[] arr; // 결과를 담을 배열
    public static boolean[] visited; // 방문 여부를 체크할 배열
    public static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N];

        backtracking(0);
        System.out.println(sb);
    }

    public static void backtracking(int level) {
        // 종료 조선
        if (level == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 가지 치기
        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[level] = i + 1;
                backtracking(level + 1);
                visited[i] = false;
            }
        }
    }
}