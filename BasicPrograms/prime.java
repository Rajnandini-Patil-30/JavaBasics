import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int flag=0;
        if(num==2)
        {
            System.out.println("Its a prime number");
        }
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                flag++;
            }
        }
        if(flag==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
        sc.close();
    }
}
