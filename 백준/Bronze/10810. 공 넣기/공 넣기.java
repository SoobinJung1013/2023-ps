import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basket = Integer.parseInt(st.nextToken());
        int[] basketArray = new int[basket+1];
        int ball = Integer.parseInt(st.nextToken());
        for (int n = 1; n <= ball; n++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int m = i; m <= j; m++) {
                basketArray[m] = k;
            }
        }
        for (int n = 1; n <= basket; n++) {
            System.out.print(basketArray[n] + " ");
        }
    }
}
