import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double max = 0;
        double sum = 0;
        
        for(int i = 0; i < N; i++){
            double score = Double.parseDouble(st.nextToken());
            if(score > max) max = score;
            sum += score;
        }
        
        System.out.println(sum * 100.0 / max / N);
    }
}