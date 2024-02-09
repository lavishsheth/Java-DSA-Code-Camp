public class Pattern5 {
    public static void main(String args[]){
        int var=5;
        int count=1;

        for(int row=1;row<=5;row++){
            for(int col=var;col>=1;col--){
                System.out.print(" "+count+" ");
                count=count+1; //count++=count+1;
            }
            System.out.println();
            var=var-1;
        }
    }
}
