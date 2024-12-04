import java.util.ArrayList;

public class ArrayDup {
    public static boolean dup(int arr[]){
        ArrayList<Integer> al=new ArrayList<Integer>();
        boolean bool=false;
        //System.out.println(arr.length);
        // for(int i=0;i<arr.length;i++){
        //     int j=i+1;
        //     while(j<arr.length){
        //         if(arr[i]==arr[j]){
        //             return true;
        //         }
        //         else{
        //             bool=false;
        //         }
        //         j++;
        //         System.out.println("hi");
        //     }
        // }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(al.contains(arr[i])){
                        bool=true;
                        break;
                    }
                }
                else{
                    al.add(arr[i]);
                }
            }
        }
        return bool;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,3};
        
        System.out.println(dup(arr));
    }
}
// import java.util.*;
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         boolean bool=false;
//         Set<Integer> hs = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));

//         if(hs.size() < nums.length) {
//             return true;
//         }
//         else{
//             bool=false;
//         }
//         return bool;
//     }
// }