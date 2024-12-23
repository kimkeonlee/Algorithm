import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int Num1 = Integer.parseInt(br.readLine());
        int Num2 = Integer.parseInt(br.readLine());
        
		System.out.println(Num1*(Num2%10));
        System.out.println(Num1*(Num2%100/10));
        System.out.println(Num1*(Num2/100));
        System.out.println(Num1*Num2);       
        
    }
    
    
}