import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int year = Integer.parseInt(tokenizer.nextToken());
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}