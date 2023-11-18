import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
        long n = Integer.parseInt(reader.readLine());

        for ( int i = 1; i <= n; i++ ) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            writer.write(a + b + "\n");
//            System.out.println(a + b);
        }
        writer.flush();   //남아있는 데이터를 모두 출력시킴
        writer.close();   //스트림을 닫음

    }
}