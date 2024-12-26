import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int Year = Integer.parseInt(br.readLine());
        
        if(( Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}