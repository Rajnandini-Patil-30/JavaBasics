import java.io.*;
import java.util.*;
public class Console_file {
    public static void main(String[] args) {
        Console cn=System.console();
        //readline
        String username=cn.readLine("Enter username: ");
        System.out.println("Username: "+username);
        //readPasswword
        char[] pass=cn.readPassword("Enter password: ");
        System.out.println("Password: "+new String(pass));
        //reader()
        Reader cnRd= cn.reader();
        Scanner sc=new Scanner(cnRd);
        System.out.println("ENter age: ");
        int age=sc.nextInt();
        System.out.println("Age: "+age);

        //output to console 
        String name="Raj";
        cn.printf("I am %s", name);
    }
}
