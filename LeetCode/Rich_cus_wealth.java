public class Rich_cus_wealth {
    public static void main(String[] args) {
        int [][] accounts=new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        int sum=0,new_sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=accounts[i][j]; 
                //System.out.println("i"+i);
            }
            System.out.println("sum: "+sum);
            if(sum>new_sum){
                new_sum=sum;
                sum=0;
            }
            sum=0;
        }
        System.out.println("new"+new_sum);
    }
}
