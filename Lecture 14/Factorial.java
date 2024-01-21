import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        int result =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        int num=sc.nextInt();

        for(int i=num;i>=1;i--){
            result=result*i;
            System.out.println(i+"="+result);
        }

        
    }
}
