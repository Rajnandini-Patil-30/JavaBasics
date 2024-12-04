package Thread_Demo;
class myclass implements Runnable{
    public void run(){
        System.out.println("IN thread : "+Thread.currentThread().getName());
        System.out.println("Hello");
        int i=0;
        while(i<=100){
            System.out.println(i+" "+Thread.currentThread().getName());
            i++;
            String name=Thread.currentThread().getName();
            if(name.equals("myclass")){
                Thread ct=Thread.currentThread();

                try {
                    ct.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
        }
    }
    
}
//priority 
public class tThread {
    public static void main(String[] args) {
        myclass c=new myclass();
        System.out.println("in main : "+Thread.currentThread().getName());
        Thread t=new Thread(c);
        Thread t2=new Thread(c);
        t.setName("myclass");
        t.start();
        t2.setName("Myclass2");
        t2.start();
        //c.run();
        t.isAlive();
        t2.isAlive();
    } 
}