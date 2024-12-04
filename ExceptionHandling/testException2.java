package ExceptionHandling;
import java.io.*;
import java.util.Scanner;
class MyException extends Exception{
    MyException(String str){
super(str);
    }
}
public class testException2 {
    public static void readFile() throws MyException{
        int x=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter x:");
        x=sc.nextInt();
        if(x>10){
            MyException me=new MyException("enter number less than 10");
            throw me;
        }else{
            System.out.println("x: "+x);
        }
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
