import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class testBuffered {
    public static void main(String[] args) {
        try{
            File f=new File("buffer.txt");
            if(!f.exists()){
                f.createNewFile();
            }
            FileWriter FW=new FileWriter(f,true);
            BufferedWriter bw=new BufferedWriter(FW);
            bw.write("Raj");
            bw.newLine();
            bw.write("Arham");
            bw.newLine();
            bw.write("Patil");
            bw.flush();
            bw.close();
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
        }catch(Exception e){
            System.out.println(e);;
        }
    }
}
