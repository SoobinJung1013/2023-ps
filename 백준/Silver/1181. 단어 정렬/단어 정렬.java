import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Word[] words = new Word[n];
        for (int i = 0; i < n; i++) {
            words[i] = new Word(br.readLine());
        }
        Arrays.sort(words);
        for (int i = 0; i < n; i++) {
            if (i > 0 && words[i].word.equals(words[i - 1].word)) {
                continue;
            }
            System.out.println(words[i].word);
        }
    }

    static class Word implements Comparable<Word> {
        String word;
        int length;

        public Word(String word) {
            this.word = word;
            this.length = word.length();
        }


        @Override
        public int compareTo(Word o) {
            if (this.length == o.length) {
                return this.word.compareTo(o.word);
            } else {
                return this.length - o.length;
            }
        }
    }
}
