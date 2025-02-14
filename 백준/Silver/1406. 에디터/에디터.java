import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        int m = Integer.parseInt(br.readLine());
        
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        
        for (int i = 0; i < input.length(); i++) {
            left.push(input.charAt(i));
        }
        
        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            char op = command.charAt(0);
            
            switch (op) {
                case 'L': 
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case 'D': 
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case 'B': 
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case 'P':
                    char ch = command.charAt(2);
                    left.push(ch);
                    break;
            }
        }
        
        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }
        
        System.out.println(sb);
    }
}
