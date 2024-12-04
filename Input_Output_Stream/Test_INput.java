import java.io.*;
public class Test_INput {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\hp\\Pictures\\PHOTO.jpeg");
        File f2=new File("C:\\Users\\hp\\Pictures\\PHOTOCOPY.jpeg");
        try{
            FileInputStream isr = new FileInputStream(f);
            FileOutputStream fos=new FileOutputStream(f2);
            //isr.mark(50000);
            int line=isr.read();
            while(line!=-1){
                fos.write(line);
                line=isr.read();
            }
            fos.flush();
            fos.close();
            System.out.println();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
