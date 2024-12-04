package ExceptionHandling;
import java.util.*;
public class TestThrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        if(age<18){
            throw new ArithmeticException("Not eligible");
        }else{
            System.out.println("Age: "+age);
        }
    }
}
