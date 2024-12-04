import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException{
        try {
            FileInputStream r=new FileInputStream("C:\\Users\\hp\\Desktop\\mySiem.xlsx");
            FileOutputStream w=new FileOutputStream("C:\\Users\\hp\\Desktop\\copySiem.xlsx");
            int i;
            while ((i=r.read())!=-1) {
                w.write((char)i);
            }
            System.out.println("Data copied successfully");

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
