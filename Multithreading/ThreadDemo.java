package Thread_Demo;
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this, "Demo Thread");
        System.out.println("Child thread: "+t);
    }
    public void run(){
        try{
            for(int n=5;n>0;n--){
                System.out.println("Child thread: "+n);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt=new NewThread();
        nt.t.start();
        try{
            for(int n=5;n>0;n--){
                System.out.println("Main thread: "+n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread");
    }
}
