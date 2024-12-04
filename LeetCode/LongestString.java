import java.util.*;
public class LongestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        char[] c1=str.toCharArray();
        Set<Character> s=new HashSet<Character>();
        for (Character character : c1) {
            s.add(character)  ;
        }
        for (Character character : s) {
            System.out.print(character);
        }
        int len=s.size();
        System.out.println("length: "+len);
    }
}
