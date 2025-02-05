import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        
        int K = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num); 
            }
        }
        
        int sum = 0;
        for (int value : stack) {
            sum += value;
        }

        System.out.println(sum);
    }
}
