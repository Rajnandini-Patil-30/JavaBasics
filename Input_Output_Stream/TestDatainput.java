import java.io.*;
public class TestDatainput {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\hp\\Pictures\\PHOTO.jpeg");
        File f2=new File("C:\\Users\\hp\\Pictures\\PHOTOCOPY.jpeg");
        try{
            FileInputStream isr = new FileInputStream(f);
            DataInputStream dis=new DataInputStream(isr);
            FileOutputStream fos=new FileOutputStream(f2);
            DataOutputStream dos=new DataOutputStream(fos);
            RandomAccessFile raf=new RandomAccessFile(f, "w");
            if(dis.markSupported()){
                System.out.println("Supoorted");
            }
            else{
                System.out.println("not");
            }
            //bis.skipNBytes(5000);
            int line=dis.read();
            while(line!=-1){
                dos.write(line);
                line=dis.read();
            }
            dos.flush();
            dos.close();
            System.out.println();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }
}

