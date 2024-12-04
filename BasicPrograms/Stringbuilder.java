public class Stringbuilder {
    public static void main(String[] args) {
        //inefficient
        String info="";
        info+="I am Rajnandini,";
        info+=" ";
        info+="from MIT-ADT";
        System.out.println(info);

        //more efficient
        StringBuilder sb= new StringBuilder("");
        sb.append("I am Divya,");
        sb.append(" ");
        sb.append("from SNDT");
        System.out.println(sb.toString());

        StringBuilder s= new StringBuilder("");
        s.append("I am Tejal,")
        .append(" ")
        .append("from MIT-ADT");
        System.out.println(sb.toString());

        //////FORMATTING//////
        System.out.println("Hello \tI am Rajnandini \nI live in pune");

        //Formating integer
        System.out.printf("Total value: %5d\n",20);
        for(int i=0;i<12;i++)
        {
            System.out.printf("Total: %2d\n",i);
        }

        //Foramting float
        System.out.printf("Total value: %f\n",5.6);
        System.out.printf("Total value: %.2f\n",5.6346474);
        System.out.printf("Total value: %6.3f",5.6346474); //consider decimal point also
    }
}
