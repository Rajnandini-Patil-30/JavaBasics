import java.util.*;
class Solution {
    public static int count=0;
    public int numberOfSteps(int num) {
        //count++;
      //  System.out.println(count);
        if(num!=0){
            if(num%2==0){
                numberOfSteps(num/2);
            }
            else{
                numberOfSteps(num-1);
            }
            count++;

        }
        else{
            return count;
        }
        
        return count;
    }
}
public class Red_numZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=sc.nextInt();
        Solution s=new Solution();
        int count=0;
        //System.out.println("count:"+s.numberOfSteps(num));
        do{
            if(num%2==0){
                num=num/2;
            }
            else{
                num=num-1;
            }
            count++;
            
        }while(num!=0);
        System.out.println(count);
        sc.close();
    }
}
