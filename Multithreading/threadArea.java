package Thread_Demo;
class sSquare implements Runnable
{
    int side;
    sSquare()
    {
        side =5;
    }
    public void run()
    {
        System.out.println("Area of Square: "+(side*side));
    }
}
class sRect implements Runnable
{
    int l,b;
    sRect()
    {
        l=5;
        b=10;
    }
    public void run()
    {
        System.out.println("Area of Rectangle: "+(l*b));
    }

}
public class threadArea {
    public static void main(String[] args) {
        sSquare s=new sSquare();
        sRect r=new sRect();
        Thread t=new Thread(s);
        Thread t1=new Thread(r);
        t.start();
        t1.start();
    }
}
