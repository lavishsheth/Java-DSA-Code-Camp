import java.util.Scanner;
class Pattern6{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter rows value:");
    int i=sc.nextInt();
    System.out.println("enter column value:");
    int j=sc.nextInt();

    //code logic begins:
    for(int row=i;row<=5;row++){
        for(int col=j;col<=5;col++){
            if(row==col){
                System.out.print("*");
            }
            else if(row+col==6 && row!=3){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}