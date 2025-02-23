import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int[] counts = new int[26];
    for (int i = 0; i < s.length(); i++) {
      counts[s.charAt(i) - 'a']++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      sb.append(counts[i]).append(" ");
    }
    System.out.println(sb.toString().trim());
  }
}
