package Inheritance;
class Class1{
    int i,j;
    Class1(int a, int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j: "+i+","+j);
    }
}
class Class2 extends Class1{
    int k;
    Class2(int a, int b,int c){
        super(a,c);
        k=c;
    }
    void show(){
        //super.show();
        System.out.println("k: "+k); //override show from Class1 //only if type signature and name is same
    }
}
public class Override {
    public static void main(String[] args) {
        Class2 c=new Class2(1, 2, 3);
        c.show();
    }
}
