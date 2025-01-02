import java.io.*;
import java.util.StringTokenizer;

public class Main{
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int v = Integer.parseInt(br.readLine());
        int total = 0;
        
        for(int num : arr){
            if(num == v) total ++;
        }
        
        System.out.println(total);        
    }
}