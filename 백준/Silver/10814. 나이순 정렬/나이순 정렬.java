import java.io.*;
import java.util.*;

public class Main {
    static class Member {
        int age;
        String name;
        int order;  

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members.add(new Member(age, name, i));
        }

        Collections.sort(members, (m1, m2) -> {
            if (m1.age == m2.age) {
                return Integer.compare(m1.order, m2.order);
            } else {
                return Integer.compare(m1.age, m2.age);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Member member : members) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }
        System.out.print(sb);
    }
}