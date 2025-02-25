import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int count = Integer.parseInt(br.readLine());
    
    int[] divisors = new int[count];
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    for (int i = 0; i < count; i++) {
      divisors[i] = Integer.parseInt(st.nextToken());
    }
    
    Arrays.sort(divisors);
    
    System.out.println((long)divisors[0] * divisors[count - 1]);
  }
}
