import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        long n = Integer.parseInt(reader.readLine());
        String result = "";

        while (n > 4) {
            result += "long ";
            n -= 4;
        }
        System.out.println(result + "long int");
    }
}