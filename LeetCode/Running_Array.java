import java.util.Scanner;
class Running_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("How many elements do you want in array: ");
        num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            if(i==0){
                arr[i]=arr[i];
            }
            else{
                arr[i]=arr[i]+arr[i-1];
            }
        }
        System.out.println("New array: ");
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}