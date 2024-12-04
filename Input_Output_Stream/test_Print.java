import java.io.*;
public class test_Print {
    public static void main(String[] args) {
        File f=new File("PrintWriter.txt");
        try{
            if(!f.exists()){
                f.createNewFile();
            }
            PrintWriter pw=new PrintWriter(f);
            pw.println(true);
            pw.print(345346467);
            pw.flush();
            pw.close();
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
