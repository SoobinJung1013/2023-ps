import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        float numArr[] = new float[num];
        float max = 0;
        float sum = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }

        for (int i = 0; i < num; i++) {
            numArr[i] = (float) numArr[i] / max * 100;
            ;
            sum += numArr[i];
        }
        System.out.println(sum / num);
    }

}
