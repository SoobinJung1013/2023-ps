import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line = br.readLine();
        Integer[] arr = new Integer[line.length()];

        for (int i = 0; i < line.length(); i++) {
            arr[i] = Integer.parseInt(line.substring(i, i+1));
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < line.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}
