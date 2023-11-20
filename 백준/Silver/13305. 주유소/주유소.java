import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 도시의 개수
        int N = Integer.parseInt(br.readLine());

        // 도로의 길이
        long[] road = new long[N - 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }

        // 도시의 리터당 가격
        long[] price = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        // 최소 비용
        long minCost = 0;
        for (int i = 0; i < N - 1; i++) { // 마지막 도시는 제외
            if (price[i] < price[i + 1]) { // 현재 도시의 리터당 가격이 다음 도시의 리터당 가격보다 작으면
                price[i + 1] = price[i]; // 다음 도시의 리터당 가격을 현재 도시의 리터당 가격으로 변경
            }
            minCost += price[i] * road[i]; // 현재 도시의 리터당 가격 * 도로의 길이
        }
        System.out.println(minCost);
    }
}