import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basket = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int basketArr[] = new int[basket + 1];
        for (int i = 1; i <= basket; i++) {
            basketArr[i] = i;
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int flag = 0;
            for (int l = start; l <= (end + start) / 2 ; l++) {
                int temp = basketArr[l];
                basketArr[l] = basketArr[end - flag];
                basketArr[end - flag] = temp;
                flag++;
            }

        }

        for (int i = 1; i <= basket; i++) {
            System.out.print(basketArr[i] + " ");
        }
    }
}
