package ExceptionHandling;
import java.util.*;

public class TestTryCatch {
    public static void main(String[] args) {
        int num=10;
        for(int i=0;i<10;i++){
            try{
                num/=i;
                System.out.print(num+" ");
            }catch(Exception e){
                System.out.println("----Exception:" +e);
            }
        }
    }
}
