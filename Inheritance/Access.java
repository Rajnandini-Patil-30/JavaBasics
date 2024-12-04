package Inheritance;
//Remove comments to understand access modifiers
class One{
    int i;
    //private int j;

    void setij(int x, int y){
        i=x;
        //j=y;
    }
}
class Two extends One{
    int total;
    void sum(){
        //total=i+j;
    }
}
public class Access {
    public static void main(String[] args) {
        Two t=new Two();
        t.setij(1, 2);
        t.sum();
        //System.out.println("Total: "+t.total);
    }
}
