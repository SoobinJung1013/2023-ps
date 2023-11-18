import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 카드의 개수
        int m = Integer.parseInt(st.nextToken()); // 카드의 합
        int max = 0;

        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n - 2; i++) {
            int sum = cards[i];
            for (int j = i + 1; j < n - 1; j++) {
                sum += cards[j];
                for (int k = j + 1; k < n; k++) {
                    sum += cards[k];
                    if (sum <= m && sum > max) {
                        max = sum;
                    }
                    sum -= cards[k];
                }
                sum -= cards[j];
            }
        }
        System.out.println(max);
    }
}
