import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int current = 1;  
        boolean possible = true;
        
        for (int i = 0; i < n; i++) {
            int target = sequence[i];
            
            while (current <= target) {
                stack.push(current++);
                sb.append("+\n");
            }
            
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }
        
        if (possible) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}
