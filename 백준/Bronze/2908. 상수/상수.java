import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer s1 = new StringBuffer(st.nextToken());
        StringBuffer s2 = new StringBuffer(st.nextToken());

        String s1Reverse = s1.reverse().toString();
        String s2Reverse = s2.reverse().toString();

        int i1 = Integer.parseInt(s1Reverse);
        int i2 = Integer.parseInt(s2Reverse);

        if (i1 > i2) {
            System.out.println(i1);
        } else {
            System.out.println(i2);
        }
    }
}
