package Thread_Demo;
class learn_wait extends Thread{
    int total=0;
    public void run(){
        synchronized(this){
            for(int i=1;i<=10;i++){
                total+=100;
            }
           // this.notify();
        }
        
    }
    
}
public class wait {
    public static void main(String[] args) {
        learn_wait w=new learn_wait();//thread 0
        //Thread t=new Thread(w);
        w.start();
        /*synchronized(w){
             try {
                w.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }*/
        try {
            w.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("total: "+w.total);

        // two threads running main and thread 0, so first main thread excuted sout line therefore total remained zero
    }
}
