package ExceptionHandling;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius cant be negative";
    }
}
class MyException extends Exception{
    public String getMessage(){
        return "Cant divide by zero";
    }
}
public class ThrowsKeyword {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI *r*r;
        return result;
    }
    public static int divide(int a,int b) throws MyException{
        int c=0;
        c=a/b;
        if(c<0){
            throw new MyException();
        }
        return c;
    }
    public static void main(String[] args) {
        try{
            int res=divide(2, 2);
            System.out.println("answer:"+res);
            try{
                double ar=area(2);
                System.out.println("Area:"+ar);
            }catch(NegativeRadiusException e){
                System.out.println(e.toString());
            }
            
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        
    }
}
