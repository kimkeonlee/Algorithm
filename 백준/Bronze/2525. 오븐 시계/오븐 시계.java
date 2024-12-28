import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    
   public static void main(String[] args) throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       String[] str = br.readLine().split(" ");
       
       int hour = Integer.parseInt(str[0]);
       int minute = Integer.parseInt(str[1]);
       int cook = Integer.parseInt(br.readLine());
       
       minute += cook;
       
       while (minute >= 60) {
           minute -= 60;
           hour ++;
           if(hour > 23){
               hour = 0;
           }
       }
       System.out.println(hour +" "+ minute);
   }
}