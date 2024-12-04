package Inheritance;
class Box{
    double width;
    double height;
    double length;
    Box(Box ob)
    {
        width=ob.width;
        height=ob.height;
        length=ob.length;
    }

    Box(double w, double h, double l){
        width=w;
        height=h;
        length=l;
    }
    Box(){
        width=height=length=-1;
    }
    Box(double len){
        width=height=length=len;
    }

    double vol(){
        return width*height*length;
    }
}

class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double l, double we){
        width=w;
        height=h;
        length=l;
        weight=we;
    }
}
/*class BoxColor extends Box{
    int color;

    BoxColor(double w, double h, double l, int c){
        width=w;
        height=h;
        length=l;
        color=c;
    }
}*/
public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1=new BoxWeight(10, 12, 14, 16);
        BoxWeight mybox2=new BoxWeight(1, 2, 3, 4);
        double vol;
        vol=mybox1.vol();
        System.out.println("Volume of Box 1: "+vol);
        System.out.println("Weight: "+mybox1.weight);

        vol=mybox2.vol();
        System.out.println("Volume of Box 2: "+vol);
        System.out.println("Weight: "+mybox2.weight);
    }
}
