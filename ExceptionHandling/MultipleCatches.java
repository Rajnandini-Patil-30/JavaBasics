package ExceptionHandling;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            int a=0;//lster set a=1 for econd catch to work
            System.out.println("a: "+a);
            int b=42/a;
            int[] c={1};
            c[42]=99;
            System.out.println("b="+b);
        }catch(ArithmeticException e){
            System.out.println("Divide by zero "+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob: "+e);
        }
        System.out.println("After try/catch block.");
    }
}
