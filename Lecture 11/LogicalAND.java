import java.util.*;
public class LogicalAND {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

//input take:
System.out.println("enter vale of a");
int a=sc.nextInt();

System.out.println("enter vale of b");
int b=sc.nextInt();

System.out.println("enter vale of c");
int c=sc.nextInt();

System.out.println("enter vale of d");
int d=sc.nextInt();

//AND Opeartor start here:
if((a<b)&&(c<d)){
    System.out.println("true");
}
else{
    System.out.println("false");
}
}
}    

