import java.util.*;
import java.io.*;
public class Test_CharArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // //CharArrayWriter

        // String arr_str;
        // CharArrayWriter char_array= new CharArrayWriter();
        // for (int i = 72; i <77; i++) {
        //     char_array.write(i);
        // }
        // arr_str=char_array.toString();
        // System.out.println("---"+arr_str);
        // System.out.println(char_array.size());

        //CharArrayReader

        char[] arr=new char[]{'a','b','c','d'};
        CharArrayReader car=new CharArrayReader(arr);
        try{
            int i=car.read();
            while(i!=-1){
                char ch=(char)i;
                i=car.read();
                System.out.println(ch);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
