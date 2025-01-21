import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] words = new String[5];
        
        for(int i = 0; i < 5; i++){
            words[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(i < words[j].length()){
                    sb.append(words[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}