import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        long n = Integer.parseInt(reader.readLine());

        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for ( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}