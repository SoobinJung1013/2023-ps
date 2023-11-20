import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] times = new int[N];
        for(int i=0; i<N; i++){
            times[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(times);

        int[] sumArr = new int[N];
        for (int i=0; i<N; i++){
            if (i==0) {
                sumArr[i] = times[i];
            } else {
                sumArr[i] = sumArr[i-1] + times[i];
            }
        }
        
        int sum = 0;
        for (int i=0; i<N; i++){
            sum += sumArr[i];
        }

        System.out.println(sum);
    }
}