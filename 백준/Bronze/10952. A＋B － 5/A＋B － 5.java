import java.io.*;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();     

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            if(A == 0 && B == 0){
                break;
            }
            sb.append(A + B).append('\n');
        }
        
        System.out.print(sb);
        br.close();
    }
}