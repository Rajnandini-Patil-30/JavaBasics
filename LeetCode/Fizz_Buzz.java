import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=sc.nextInt();
        List<String> l2 = new ArrayList<String>();
        for(int i=1;i<=5;i++){
            if(i%3==0 && i%5==0){
                l2.add("FizzBuzz");
            }
            else if(i%3==0){
                l2.add("Fizz");
            }
            else if(i%5==0){
                l2.add("Buzz");
            }
            else{
                l2.add(Integer.toString(i));
            }
        }
        for(String n:l2){
            System.out.println(n);
        }
        sc.close();
    }
}
