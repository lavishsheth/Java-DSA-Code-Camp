class Pattern4{
    public static void main(String args[]){
        int count = 1;

        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" "+count+" ");
                count=count+1;
            }
            System.out.println();
        }
    }
}