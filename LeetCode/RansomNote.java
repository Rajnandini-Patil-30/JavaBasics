import java.util.*;
public class RansomNote {
    public static void main(String[] args) {
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter ransom note: ");
        String ransom=sc.nextLine();
        System.out.println("Enter magazine string: ");
        String magazine=sc.nextLine();
        for(int i=0;i<magazine.length();i++){
            while (j<ransom.length()) {
                char r=ransom.charAt(j);
                char as=r;
                    if(magazine.contains(as)){
                        char r=ransom.charAt(j);
                        String rr=String.valueOf(r);
                        String rep="\u0000";
                        magazine = magazine.replaceFirst(rr, rep); // Replace 'o' with an empty string
                        ransom = ransom.replace(r, '\u0000');
                    }
                j++;
            }
        }
        System.out.println(magazine);
    }
        // char[] rN=ransom.toCharArray();
        // char[] m=magazine.toCharArray();
        // List<char[]> list1 = Arrays.asList(rN);
        // List<char[]> list2 = Arrays.asList(m);
        // int len=list1.size(),i=0;
        // int len_mag=list2.size();
        // while(i<len){
        //     if(list1[i])
        // }

    // private static String String(char r) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'String'");
    // }
}

