import java.io.*;
import java.util.*;
public class Student_project {
    public static void main(String[] args) {
        File f=new File("Student database.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Student entries: ");
        int num=sc.nextInt();
        int roll,age;
        String dep,std_name;
        long mob;
        try{
            PrintWriter pw=new PrintWriter(f);
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            if(!f.exists()){
                f.createNewFile();
            }
            for(int i=1;i<=num;i++){
                System.out.println("ENTER DETAILS FOR STUDENT "+i);
                System.out.print("Roll no.: ");
                roll=sc.nextInt();
                pw.print(roll+",");
                sc.nextLine();
                System.out.print("Student Name: ");
                std_name=sc.nextLine();
                pw.print(std_name+",");
                System.out.print("Age: ");
                age=sc.nextInt();
                pw.print(age+",");
                sc.nextLine();
                System.out.print("Department: ");
                dep=sc.nextLine();
                pw.print(dep+",");
                System.out.print("Mobile No.: ");
                mob=sc.nextLong();
                pw.print(mob);
                pw.println();
                pw.flush();
            }
            pw.close();
            System.out.println("Enter which Roll number entry you want to see: ");
            String entry=String.valueOf(sc.nextInt());
            String line=br.readLine();
            while(line!=null){
                String arr1[] = line.split(",");
                StringTokenizer st = new StringTokenizer(line);  
                String check=st.nextToken(",");
                if(arr1[0].equals(entry)){
                    System.out.println(line);
                }
                line=br.readLine();
                
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
