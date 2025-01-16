import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int A = reverseNumber(input[0]);
        int B = reverseNumber(input[1]);
        
        System.out.println(Math.max(A, B));
    }
    
    private static int reverseNumber(String num){
        StringBuilder sb = new StringBuilder(num);
        return Integer.parseInt(sb.reverse().toString());
    }
}