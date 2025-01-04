import java.io.*;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] basket = new int[N];
        
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int ball = Integer.parseInt(st.nextToken());
            
            for(int j = start; j <= end; j++){
                basket[j] = ball;
            }
        }
        for(int i = 0; i < N; i++){
            sb.append(basket[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}