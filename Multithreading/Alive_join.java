package Thread_Demo;
// Use this editor to write, compile and run your Java code online
class myclass implements Runnable{
    public void run(){
        Thread c=Thread.currentThread();
        System.out.println("Hello "+c.currentThread().getName());
        try {
            c.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
class Alive_join {
    public static void main(String[] args) {
       myclass m=new myclass();
       Thread t1=new Thread(m);
       Thread t2=new Thread(m);
       Thread t3=new Thread(m);
       
       System.out.println("Thread 1"+t1.isAlive());
       System.out.println("THread 2"+t2.isAlive());
       System.out.println("THread 3"+t3.isAlive());

       t1.setName("Thread 1");
       t2.setName("Thread 2");
       t3.setName("Thread 3");

       t1.start();
       t2.start();
       t3.start();

        t1.setPriority(8);
        t2.setPriority(6);
        t3.setPriority(9);
       try{
        t1.join();
        t2.join();
        t3.join();
       }catch(Exception e){
        System.out.println("exception: "+e);
       }

       System.out.println("Thread 1"+t1.isAlive());
       System.out.println("THread 2"+t2.isAlive());
       System.out.println("THread 3"+t3.isAlive());

    }
}