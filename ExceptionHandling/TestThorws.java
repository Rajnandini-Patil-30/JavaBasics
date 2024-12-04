package ExceptionHandling;
import java.util.Scanner;
import java.io.*;
class ThrowsClass extends Exception{
    ThrowsClass(String str){
        super(str);
    }
}
public class TestThorws{
    public static void check() throws ThrowsClass{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine();
        if(!s.equals("raj")){
            ThrowsClass tc=new ThrowsClass("String not same");
            throw tc;
        }else{
            System.out.println("Raj: "+s);
        }
    }
    public static void main(String[] args) {
        try{
            check();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
