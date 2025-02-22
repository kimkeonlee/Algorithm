import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] A = new int[N];
    int[] res = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st.nextToken());
      res[i] = -1;
    }
      
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < N; i++) {
      while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
        res[stack.pop()] = A[i];
      }
      stack.push(i);
    }
      
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < N; i++) {
      sb.append(res[i]).append(" ");
    }
    System.out.println(sb.toString().trim());
      
  }
}
