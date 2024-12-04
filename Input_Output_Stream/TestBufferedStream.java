import java.io.*;
public class TestBufferedStream {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\hp\\Pictures\\PHOTO.jpeg");
        File f2=new File("C:\\Users\\hp\\Pictures\\PHOTOCOPY.jpeg");
        try{
            FileInputStream isr = new FileInputStream(f);
            BufferedInputStream bis=new BufferedInputStream(isr);
            FileOutputStream fos=new FileOutputStream(f2);
            if(bis.markSupported()){
                System.out.println("Supoorted");
            }
            else{
                System.out.println("not");
            }
            //bis.skipNBytes(5000);
            int line=bis.read();
            while(line!=-1){
                fos.write(line);
                line=bis.read();
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
