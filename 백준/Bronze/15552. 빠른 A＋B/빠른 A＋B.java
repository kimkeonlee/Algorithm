import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<num ; i++ ){
            String[] str = br.readLine().split(" ");
            
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            bw.write((a + b) + "\n");
        }
        br.close();
        
        bw.flush();
        bw.close();
    }
}