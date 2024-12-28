import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        int num3 = Integer.parseInt(str[2]);
        int prize = 0;
        
        if(num1 == num2 && num2 == num3){
            prize = 10000 + num1 * 1000;    
        } else if(num1 == num2 || num1 == num3){
            prize = 1000 + num1 * 100;
        } else if(num2 == num3){
            prize = 1000 + num2 * 100;
        } else{
            prize = Math.max(num1, Math.max(num2, num3)) * 100;
        }
        
        System.out.println(prize);
    }
}