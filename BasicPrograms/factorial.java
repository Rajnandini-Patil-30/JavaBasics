import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a =sc.nextInt();
        int fac=1;
        for(int i=1;i<=a;i++)
        {
            fac=fac*i;
            System.out.println(fac);
        }
        System.out.println("Factorial: "+fac);
        sc.close();
    }
}
