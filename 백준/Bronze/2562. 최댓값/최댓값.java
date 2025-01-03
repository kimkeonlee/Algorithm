import java.io.*;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int maxValue = 0;
        int maxIndex = 0;
        
        for(int i = 1; i <= 9; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > maxValue) {
            maxValue = num;
            maxIndex = i;
        }
    }
        
    StringBuilder sb = new StringBuilder();
    sb.append(maxValue).append('\n').append(maxIndex);
    System.out.println(sb);
    }
}