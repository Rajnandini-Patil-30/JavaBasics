package Inheritance;
class SuperBox{
    private double weight;
    private double height;
    private double length;

    SuperBox(SuperBox ob){
        weight=ob.weight;
        height=ob.height;
        length=ob.length;
    }

    SuperBox(double w, double h, double l){
        weight=w;
        height=h;
        length=l;
    }

    SuperBox(double l){
        weight=height=length=l;
    }

    SuperBox(){
        weight=height=length=-1;
    }

    double vol(){
        return weight*height*length;
    }
}

class SuperBoxWeight extends SuperBox{
    double weight;
    SuperBoxWeight(SuperBoxWeight ob){
        super(ob);
        weight=ob.weight;
    }

    SuperBoxWeight(double w, double h, double l, double we){
        super(w,h,l);
        weight=we;
    }

    SuperBoxWeight(){
        super();
        weight=-1;
    }

    SuperBoxWeight(double l, double we){
        super(l);
        weight=we;
    }
}
public class DemoSuperBox {
    public static void main(String[] args) {
        SuperBoxWeight mybox1=new SuperBoxWeight(10,20,15,34.3);
        SuperBoxWeight cube=new SuperBoxWeight(3,2); //cube
        SuperBoxWeight mybox2=new SuperBoxWeight(); //default
        SuperBoxWeight myclone=new SuperBoxWeight(mybox1); //pass object 

        double vol;
        vol=mybox1.vol();
        System.out.println("My box 1 vol: "+vol);
        System.out.println("My box 1 weight: "+mybox1.weight);
        System.out.println();
        vol=cube.vol();
        System.out.println("Cube vol: "+vol);
        System.out.println("Cube weight: "+cube.weight);
        System.out.println();
        System.out.println("My box 1 vol: "+mybox2.vol());
        System.out.println("My box 1 weight: "+mybox2.weight);
        System.out.println();
        vol=myclone.vol();
        System.out.println("Clone vol: "+vol);
        System.out.println("Clone weight: "+myclone.weight);
    }
}
