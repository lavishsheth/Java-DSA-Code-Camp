import java.util.Scanner;

public class CharScanner {
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
//for char:
System.out.println("enter value of character: ");
char a = sc.next().charAt(0);
System.out.println("value of char: "+a);
}
}
