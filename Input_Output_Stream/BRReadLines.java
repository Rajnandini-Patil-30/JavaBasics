import java.io.*;
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in,System.console().charset()));
        String str;
        System.out.println("Enter lines of text or enter 'stop' to quit");
        do{
            str=br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
    }
}
