package Inheritance;
class Aa{
    void callMe(){
        System.out.println("I am Super class A");
    }
}
class Bb extends Aa{
    void callMe(){
        System.out.println("I am subclass B");
    }
}
class Cc extends Aa{
    void callMe(){
        System.out.println("I am subclass C");
    }
}
public class DynamicOverride {
    public static void main(String[] args) {
        Aa a=new Aa();
        Bb b=new Bb();
        Cc c=new Cc();
        Aa r; //refernce of type Aa
        r=a; //refers to type Aa object
        r.callMe();
        r=b;
        r.callMe();
        r=c;
        r.callMe();
    }
}
