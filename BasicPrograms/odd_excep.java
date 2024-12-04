public class odd_excep {
    public static void main(String[] args) {
        int num=8;
            if(num%2==0)
            {
                System.out.println("Even: "+num);
            }
            else{
                throw new ArithmeticException("Odd number "+num);
            }
        }
}
