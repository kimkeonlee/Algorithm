import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int stack = 0, result = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        stack++;
      } else {
        if (s.charAt(i - 1) == '(') {
          stack--;
          result += stack;
        } else {
          stack--;
          result++;
        }
      }
    }
    System.out.println(result);
  }
}
