import java.io.*;
public class test2 {
    public static void main(String[] args) {
        File f=new File("abc.txt");
        // File ff=new File("pqr.txt");
        try{
            if(!f.exists()){
                f.createNewFile();
            }else{
                FileWriter fw=new FileWriter(f);
                fw.write("Raj");
                fw.write("\nNandini");
                fw.write("\nPatil");
                fw.flush();
                fw.close();
                int len =(int)f.length();
                FileReader fr=new FileReader(f);
                char[] ar=new char[len];
                int read=fr.read(ar);
                System.out.println(ar);
                // while(read!=-1){
                //     System.out.print((char)read);
                //     read=fr.read();
                // }
                fr.close();
            }      
        }catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
        //f.renameTo(ff);
    }
}
