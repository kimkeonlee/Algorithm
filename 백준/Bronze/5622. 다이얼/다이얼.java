import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int second = 0;
        
        for(char c : input.toCharArray()){
            second += getDialTime(c);
        }
        System.out.println(second);
    }
    
    private static int getDialTime(char c){
        if(c >= 'A' && c <= 'C') return 3;
        if(c >= 'D' && c <= 'F') return 4;
        if(c >= 'G' && c <= 'I') return 5;
        if(c >= 'J' && c <= 'L') return 6;
        if(c >= 'M' && c <= 'O') return 7;
        if(c >= 'P' && c <= 'S') return 8;
        if(c >= 'T' && c <= 'V') return 9;
        if(c >= 'W' && c <= 'Z') return 10;
        return 0;
    }
}