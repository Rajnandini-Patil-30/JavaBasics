import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class createFile {
    public static void main(String[] args) {
        File myfile=new File("C:\\Users\\hp\\Desktop\\Java\\InputOutputStream\\FH.txt");
        try{
            myfile.createNewFile();
            FileWriter myfileWriter = new FileWriter(myfile);
            myfileWriter.write("This is first file from this java course");
            myfileWriter.close();
        }catch(IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
    }
}