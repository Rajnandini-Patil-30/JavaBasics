package Thread_Demo;
class ourClass implements Runnable{
    public void run(){
        int i=0;
        while(i<5){
            Thread ct=Thread.currentThread();
            System.out.println("Hi  "+Thread.currentThread().getName());
            try {
                //ct.wait();
                ct.sleep(1000);;
               // ct.notifyAll();
            }catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            i++;
        }
    }
}
public class Prac_thread {
    public static void main(String[] args) {
        ourClass o=new ourClass();
        Thread thd=new Thread(o);
        Thread thd2=new Thread(o);
        thd.start();
        // try {
        //     thd.join();
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        thd.setName("Player1");
        thd2.start();
        thd2.setName("Player2");
        try {
            for(int i=0;i<5;i++){
                thd.wait();
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
