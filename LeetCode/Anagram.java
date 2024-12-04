import java.util.Arrays;

class Anagram{
    public static void main(String[] args) {
        String s="aaa";
        String t="aaa";
        char[] s_arr=s.toCharArray();
        char[] t_arr=t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        // System.out.println("s arr:");
        // for (char c : s_arr) {
        //     System.out.print(c);
        // }
        // System.out.println("t arr:");
        // for (char c : t_arr) {
        //     System.out.print(c);
        // }
        boolean ans;
        ans=Arrays.equals(s_arr, t_arr);
        System.out.println(ans);
        System.out.println(s_arr.length);
    }
}