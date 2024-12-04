import java.util.ArrayList;

public class TwoNote {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4};
        int target=5;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ar.add(i);
                    ar.add(j);
                }
            }
        }
        for (Integer integer : ar) {
            System.out.print(integer);
        }
    }
}
