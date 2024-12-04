import java.util.Scanner;
public class paline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        String new_num=Integer.toString(num);
        int len=new_num.length();
        int flag=0;
        for(int i=0;i<len;i++)
        {
            if(new_num.charAt(i)!=new_num.charAt(len-i-1))
            {
                flag++;
            }
        }
        if(flag>0)
        {
            System.out.println("Not a palindrome");
        }
        else
        {
            System.out.println("palindrome");
        }
        sc.close();
    }
}
