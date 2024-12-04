package ExceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try{
            int a=args.length;// set a=1 then a=2
            int b=42/a;
            System.out.println("a="+a);
            System.out.println("b="+b);
            try{
                if(a==1){
                    a=a/(a-a);
                }
                if(a==2){
                    int[] c={1};
                    c[42]=99;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of index"+e);
            }
        }catch(ArithmeticException e){
            System.out.println("Divide by zero"+e);
        }
    }
}
