package Thread_Demo;
class first implements Runnable
{
    public void run()
    {
        System.out.println("THREAD");
    }
}
class second implements Runnable
{
    public void run()
    {
        System.out.println("TT");
    }
}
public class threadRun {
    public static void main(String[] args) {
        first t1=new first();
        second t2=new second();
        Thread t =new Thread(t1);
        t.start();
        Thread tt=new Thread(t2);
        tt.start();
        

    }
}
