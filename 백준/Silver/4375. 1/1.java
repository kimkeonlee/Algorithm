import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    String line;
      
    while ((line = br.readLine()) != null) {
      line = line.trim();
        
      if(line.equals("")) continue;
   
      int n = Integer.parseInt(line);
      int count = 1;
      int rem = 1 % n;
        
      while(rem != 0) {
        rem = (rem * 10 + 1) % n;
        count++;
      }
        
      System.out.println(count);
        
    }
  }
}
