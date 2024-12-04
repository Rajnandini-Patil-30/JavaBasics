package Inheritance;
class Figure{
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1=a;
        dim2=b;
    }

    double area(){
        System.out.print("Area of figure is undifined:");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.print("Area of rectangle: ");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.print("Area of Triangle:");
        return dim1*dim2*0.5;
    }
}
public class FindAreas {
    public static void main(String[] args) {
        Figure f=new Figure(10, 10);
        Rectangle re=new Rectangle(12, 11);
        Triangle tr=new Triangle(10, 5);

        Figure fig;
        fig=f;
        System.out.println(fig.area());

        fig=re;
        System.out.println(fig.area());

        fig=tr;
        System.out.println(fig.area());
    }
}
