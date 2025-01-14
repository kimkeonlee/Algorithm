import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
       String a = br.readLine();
        
        int[] arr = new int[26];
        
        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }
        
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            int index = c - 'a';
            
            if(arr[index] == -1) arr[index] = i;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
