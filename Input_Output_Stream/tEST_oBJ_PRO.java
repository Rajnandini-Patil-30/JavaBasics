import java.util.*;
import java.io.*;
class employee implements Serializable{
    int empId;
    String name;
    employee(int id,String name){
        this.empId=id;
        this.name=name;
    }
}

public class tEST_oBJ_PRO{
    public static void main(String arg[]){
        employee e1=new employee(1,"Raj");
        employee e2=new employee(2,"Arham");
        employee e3=new employee(3,"Chinu");

        try{
            File f=new File("EmpFile.txt");
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            // Three objects stored in a file after coinverting in a writable format using serializable 
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.writeObject(e3);
            oos.flush();
            oos.close();

            // Objects read from file deserialized and converted to object and printed on console
            System.out.println("\nFirst employee: ");
            employee new_e1=(employee)ois.readObject();
            System.out.print(new_e1.empId+" ");
            System.out.println(new_e1.name);
            System.out.println("\nSecond employee: ");
            employee new_e2=(employee)ois.readObject();
            System.out.print(new_e2.empId+" ");
            System.out.println(new_e2.name);
            System.out.println("\nThird employee: ");
            employee new_e3=(employee)ois.readObject();
            System.out.print(new_e3.empId+" ");
            System.out.println(new_e3.name);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}