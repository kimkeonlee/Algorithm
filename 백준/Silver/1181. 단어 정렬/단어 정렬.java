import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < N; i++){
            set.add(br.readLine());
        }
        
        List<String> words = new ArrayList<>(set);
        
        Collections.sort(words, (s1, s2) -> {
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return s1.length() - s2.length();
        });
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            sb.append(word).append('\n');
        }
        System.out.print(sb);        
    }
}