package Thread_Demo;
class NewThraed extends Thread{
    //Thread t;
    NewThraed(){
        super("Demo Thread");
        System.out.println("Child thread: "+this);
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
public class ExtendTread {
    public static void main(String[] args) {
        NewThraed nt=new NewThraed();
        nt.start();
        try{
            for(int n=5;n>0;n--){
                System.out.println("Main thread: "+n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }   
}
