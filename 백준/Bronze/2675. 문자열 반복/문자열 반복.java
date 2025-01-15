import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1]; 

            StringBuilder sb = new StringBuilder(); 
            for (char c : S.toCharArray()) {
                sb.append(String.valueOf(c).repeat(R));
            }
            result.append(sb).append("\n");
        }

        System.out.print(result);
    }
}
