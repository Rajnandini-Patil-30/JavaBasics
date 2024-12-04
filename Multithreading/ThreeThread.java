package Thread_Demo;
//Write a java program that implements a multithread application that has three threads. First thread generates a random integer every one second
//and if the value is even, the second thread computes the square of the number and prints. If the values is odd, the third thread will print the value
//of the cube of the number
import java.lang.Math;
public class ThreeThread {
    public static void main(String args[])
    {
        Runnable r =new randomNo();
        Thread t1= new Thread(r);
        t1.start();
    }
}
class randomNo implements Runnable
{
    public void run()
    {
        int range = 1000;
        int a =(int)(Math.random()*range);
        System.out.println(a);
    }
}
