package Thread_Demo;
//import java.util.Scanner;
/**
 * thread1
 */
class threadFirst extends Thread
{
    public void run()
    {
        System.out.println("I am thread class one");
    }
}
class thread2 extends Thread{
    public void run()
    {
        System.out.println("I am thread clas 2");
    }
}
public class thread1 {

    public static void main(String args[])
    {
        threadFirst t1=new threadFirst();
        thread2 t2=new thread2();
        t1.start();
        t2.start();
    }
}