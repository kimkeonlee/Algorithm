import java.io.*;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] balls = new int[N];
        for(int i = 0; i < N; i++) {
            balls[i] = i + 1;
        }
        
        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            
            int temp = balls[i];
            balls[i] = balls[j];
            balls[j] = temp;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int ball : balls) {
            sb.append(ball).append(" ");
        }
        
        System.out.println(sb);
    }
}
