package ExceptionHandling;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a=0;
            int b=42/a;
            System.out.println("b="+b);
        }/*catch(Exception e){
            System.out.println("Divide by zero "+e);
        }catch(ArithmeticException e){ //Sub class must be before superclass
            System.out.println("THis is never reached");// arithmethic is subclass it should be before exception
        }*/catch(ArithmeticException e){
            System.out.println("Divide by zero "+e);
        }catch(Exception e){ //Sub class must be before superclass
            System.out.println("THis is never reached");// arithmethic is subclass it should be before exception
        }
    }
}
