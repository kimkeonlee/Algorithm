import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] check = new boolean[42];
        int count = 0;
        
        for(int i = 0; i < 10; i++) {
            check[Integer.parseInt(br.readLine()) % 42] = true;
        }
        
        for(boolean b : check) {
            if(b) count++;
        }
        
        System.out.println(count);
    }
}
