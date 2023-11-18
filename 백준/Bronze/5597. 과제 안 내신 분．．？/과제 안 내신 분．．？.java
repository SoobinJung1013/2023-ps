import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int STUDENT_NUM = 30;
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[STUDENT_NUM+ 1];

        for (int i = 1; i <= STUDENT_NUM - 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            arr[num] = 1;
        }

        for (int i = 1; i <= STUDENT_NUM; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
