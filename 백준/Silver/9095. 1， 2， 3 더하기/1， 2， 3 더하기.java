import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    
    int[] dp = new int[11];
    dp[0] = 1;
    for (int i = 1; i <= 10; i++) {
      if(i - 1 >= 0) dp[i] += dp[i - 1];
      if(i - 2 >= 0) dp[i] += dp[i - 2];
      if(i - 3 >= 0) dp[i] += dp[i - 3];
    }
    
    StringBuilder sb = new StringBuilder();
    for (int t = 0; t < T; t++) {
      int n = Integer.parseInt(br.readLine());
      sb.append(dp[n]).append("\n");
    }
    System.out.print(sb);
  }
}
