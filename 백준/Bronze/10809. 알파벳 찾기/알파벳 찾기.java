import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] alp = new long[26];
        for (int i = 0; i < 26; i++) {
            alp[i] = -1;
        }
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (alp[str.charAt(i) - 'a'] == -1) {
                alp[str.charAt(i) - 'a'] = i;
            } else {
                continue;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alp[i] + " ");
        }
    }
}
