package Thread_Demo;
class MultiNewThread implements Runnable{
    String name;
    Thread t;
    MultiNewThread(String n){
        name=n;
        t=new Thread(this,name);
        System.out.println("New thread: "+t);
    }
    public void run(){
        try{
            for(int n=5;n>0;n--){
                System.out.println(name+" thread: "+n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting "+name+" thread");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        MultiNewThread mnt=new MultiNewThread("one");
        MultiNewThread mnt2=new MultiNewThread("Two");
        MultiNewThread mnt3=new MultiNewThread("Three");
        mnt.t.start();
        mnt2.t.start();
        mnt3.t.start();
        try{
           Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
