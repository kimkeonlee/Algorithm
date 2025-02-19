import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean inTag = false; 
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '<') { 
                result.append(word.reverse());
                word.setLength(0);
                inTag = true;
                result.append(c);
            } else if (c == '>') {
                inTag = false;
                result.append(c);
            } else if (inTag) {
                result.append(c);
            } else {
                if (c == ' ') {
                    result.append(word.reverse());
                    word.setLength(0);
                    result.append(c);
                } else {
                    word.append(c);
                }
            }
        }
        result.append(word.reverse());
        
        System.out.println(result);
    }
}
