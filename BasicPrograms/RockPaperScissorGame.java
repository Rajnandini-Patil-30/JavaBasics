import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorGame
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int ran=r.nextInt(3)+1;
        System.out.println("Enter 1 for Rock\nEnter 2 for Paper\nEnter 3 for Scissor: ");
        int choice=sc.nextInt();
        if(choice==1 && ran==2 || choice==2 && ran==3 || choice==3 && ran==1)
        {
            System.out.println("You lose, Computer Won");
            System.out.println("Your choice: "+choice+" computer choice: "+ran);
        }
        else if(choice==1 && ran==3 || choice==2 && ran==1 || choice==3 && ran==2)
        {
            System.out.println("You Win, Congrats");
            System.out.println("Your choice: "+choice+" computer choice: "+ran);
        }
        else
        {
            System.out.println("Draw");
            System.out.println("Your choice: "+choice+" computer choice: "+ran);
        }
        sc.close();
    }
}