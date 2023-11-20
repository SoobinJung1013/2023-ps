import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        // N!
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}