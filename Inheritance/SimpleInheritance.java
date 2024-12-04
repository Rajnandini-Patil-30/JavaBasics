package Inheritance;
class A{
    int i,j;
    void show(){
        System.out.println("i and j: "+i+" "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        A superobj=new A();
        B subobj= new B();

        superobj.i=2;
        superobj.j=3;

        superobj.show();

        subobj.i=1;
        subobj.j=2;
        subobj.k=3;
        subobj.showk();
        subobj.sum();
    }
}
