import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {

    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line.charAt(j) + "");
            }
        }

        bfs(0, 0);
        System.out.println(arr[n - 1][m - 1]); // 도착점
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y}); // 시작점
        visited[x][y] = true; // 시작점 방문처리

        while (!q.isEmpty()) {
            int[] point = q.poll();
            int px = point[0];
            int py = point[1];

            for (int i = 0; i < 4; i++) { // 상하좌우
                int nx = px + dx[i];
                int ny = py + dy[i];

                if (nx >= 0 && nx < arr.length && ny >= 0 && ny < arr[0].length) { // 범위 체크
                    if (arr[nx][ny] != 0 && !visited[nx][ny]) { // 방문하지 않은 1인 경우
                        q.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        arr[nx][ny] = arr[px][py] + 1; // 이전 좌표의 값 + 1
                    }
                }
            }
        }
    }
}
