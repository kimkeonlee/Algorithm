import java.io.*;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = i + 1;
        }
        
        for(int k = 0; k < M; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        for(int i = 0; i < N; i++){
            sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}