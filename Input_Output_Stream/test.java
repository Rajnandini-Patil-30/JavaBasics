import java.io.*;
public class test {
    public static void main(String[] args) {
        File f = new File("C:\\");
        //f.mkdir();
        if(f.exists()){
            // long len=f.length();
            // System.out.println("len:"+len);
            // f.delete();
            String[] strArr=f.list();
            for (String flString : strArr) {
                File ff=new File(f, flString);
                if(ff.isDirectory()){
                    System.out.println(flString+"-directory");
                    String[] strArray=ff.list();
                        for (String string : strArray) {
                            if(ff!=null){
                                System.out.println("---"+string);
                            }
                        }
                }else{
                    System.out.println(flString+"-File");
                }
                
            }
        }else{
            System.out.println("File not fund");
        }
        

    }
}
