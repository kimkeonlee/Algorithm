import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        int sum = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0; i<sum; i++){
            String[] str = br.readLine().split(" ");
            int price = Integer.parseInt(str[0]);
            int num = Integer.parseInt(str[1]);
            answer += price * num;
        }
        
        if(total == answer){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}