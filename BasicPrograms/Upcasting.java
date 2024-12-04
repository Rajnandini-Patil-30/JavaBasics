class Mobile{
    int a;
    public void photo(){
        System.out.println("Mobile started");
    }
}
class camera extends Mobile{
    private int b;
    public void photo(){
        System.out.println("Camera started");
    }
    public void snap(){
        System.out.println("Photo taken");
    }


}
public class Upcasting {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        camera c1=new camera();
        m.photo();
        c1.photo();

        Mobile m2=c1;
        m2.photo();
        // m2.snap(); //only photo because Mobile class doesnt have snap method
        Mobile m3=new camera();
        camera c2=(camera)m3;
    }
}
