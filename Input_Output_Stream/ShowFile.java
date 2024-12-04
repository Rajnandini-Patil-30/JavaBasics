import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.*;
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // if(args.length!=1){
        //     System.out.println("Show file name");
        //     return;
        // }
        try{
            fin=new FileInputStream("c:\\hello.txt");
        }catch(FileNotFoundException e){
            System.out.println("cannot open file");
            return;
        }
        try{
            do{
                i=fin.read();
                if(i!=-1){
                    System.out.println((char)i);
                }
            }while(i!=-1);
       }catch(IOException e){
            System.out.println("Error readin file");
        }
        try{
            fin.close();
        }catch(IOException e){
            System.out.println("cannot open file");
        }
    }
}
