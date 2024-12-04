import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check Armstrong: ");
        int num=sc.nextInt();
        int tmp=0,digit=0,last=0,sum=0;
        tmp=num;
        while(tmp>0)
        {
            tmp/=10;
            digit++;
        }
        tmp=num;
        for(int i=1;i<=digit;i++)
        {
           last=tmp%10;
           tmp=tmp/10;
            sum+=Math.pow(last, digit);
        }
        System.out.println("Sum of "+num+" :"+sum);
        if(sum==num)
        {
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not armstrong");
        }
        sc.close();
    }
}
