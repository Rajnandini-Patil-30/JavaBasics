import java.util.Scanner;
class fib
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the range for fibnancci series: ");
        int num=sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonacci Series: ");
        System.out.print(a+" "+b+" ");

        while(num-2>0)
        {
            c=a+b;
            //System.out.print(b+",");
            System.out.print(c+" ");
            a=b;
            b=c;
            num--;
        }
        sc.close();
    }
}