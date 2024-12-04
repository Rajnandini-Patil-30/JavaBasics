import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("Element: "+i+j);
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
