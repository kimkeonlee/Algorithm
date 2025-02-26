import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int[] dwarfs = new int[9];
    
    for (int i = 0; i < 9; i++) {
      dwarfs[i] = Integer.parseInt(br.readLine());
    }
    
    int totalSum = 0;
    
    for (int i = 0; i < 9; i++) {
      totalSum += dwarfs[i];
    }
    
    outer:
    for (int i = 0; i < 8; i++) {
      for (int j = i + 1; j < 9; j++) {
        if (totalSum - (dwarfs[i] + dwarfs[j]) == 100) {
          List<Integer> result = new ArrayList<>();
          
          for (int k = 0; k < 9; k++) {
            if (k != i && k != j) {
              result.add(dwarfs[k]);
            }
          }
          
          Collections.sort(result);
          
          for (int num : result) {
            System.out.println(num);
          }
          
          break outer;
        }
      }
    }
  }
}
