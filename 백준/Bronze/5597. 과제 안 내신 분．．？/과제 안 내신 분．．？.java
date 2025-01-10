import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] submitted = new boolean[31];
        
        for(int i = 0; i < 28; i++) {
            submitted[Integer.parseInt(br.readLine())] = true;
        }
        
        for(int i = 1; i <= 30; i++) {
            if(!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}
