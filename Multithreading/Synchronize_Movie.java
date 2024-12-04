package Thread_Demo;
class booking{
    int total_seats=10;
    synchronized void ticket(int seats){
        
        if(seats<=total_seats){
            System.out.println("*tickets booked");
            total_seats-=seats;
            System.out.println("Seats left: "+total_seats);
        }else{
            System.out.println("seats not booked");
            System.out.println("remaining seats: "+total_seats);
        }
    }
}
public class Synchronize_Movie extends Thread {
    static booking b;
    int seat=0;
    public void run(){
        b.ticket(seat);
    }
    public static void main(String[] args) {
        b=new booking();
        Synchronize_Movie raj=new Synchronize_Movie();
        raj.seat=7;
        raj.start();

        Synchronize_Movie tejal=new Synchronize_Movie();
        tejal.seat=6;
        tejal.start();
    }
}
