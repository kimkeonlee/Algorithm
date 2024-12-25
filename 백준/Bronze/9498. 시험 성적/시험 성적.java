import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int Score = Integer.parseInt(br.readLine());
        
        if (Score >= 90) {
            System.out.println("A");
        } else if (Score >= 80) {
            System.out.println("B");         
        } else if (Score >= 70) {
            System.out.println("C");            
        } else if (Score >= 60) {
            System.out.println("D");            
        } else {
            System.out.println("F");            
        }
    }
}