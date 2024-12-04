import java.io.*;
class emp implements Serializable{
    int empId;
    String name;
    emp(int empId,String name){
        this.name=name;
        this.empId=empId;
    }
}
public class TestObject {
    public static void main(String[] args) {
        emp e=new emp(1, "raj");
        try{
            File f=new File("OBJEECT_File.txt");
            // FileOutputStream fos=new FileOutputStream(f);
            // ObjectOutputStream oos=new ObjectOutputStream(fos);
            // oos.writeObject(e);
            // oos.flush();
            // oos.close();
            FileInputStream fis= new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            emp e1=(emp)ois.readObject();
            System.out.println(e1.empId);
            System.out.println(e1.name);
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
}
