import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] original = new int[N];  
        int[] sorted;  
        HashMap<Integer, Integer> rankMap = new HashMap<>(); 

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
        }

        sorted = original.clone();
        Arrays.sort(sorted);

        int rank = 0;
        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(rankMap.get(original[i])).append(" ");
        }

        System.out.println(sb);
    }
}
