import java.util.Scanner;
class Pattern3{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your value");
    int var = sc.nextInt();

    for(int row=0;row<5;row++){
        for(int col=var;col>=1;col--){
            System.out.print(" * ");
        }
        System.out.println();
        var=var-1; //var-=1
    }
    }
}