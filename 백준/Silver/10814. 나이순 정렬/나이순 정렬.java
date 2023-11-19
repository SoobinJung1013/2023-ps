import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        User[] users = new User[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            users[i] = new User(i, age, name);
        }

        Arrays.sort(users);

        for (int i = 0; i < n; i++) {
            System.out.println(users[i].age + " " + users[i].name);
        }
    }

    static class User implements Comparable<User> {
        int num;
        int age;
        String name;

        public User(int i, int age, String name) {
            this.num = i;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(User o) {
            if (this.age == o.age) {
                return this.num - o.num;
            }
            return this.age - o.age;
        }
    }
}
