public class Fabonnaci {
public static void main(String args[]){
    int a=0;
    int b=1;

    System.out.println(a); //step 1=0
    System.out.println(b); //step 2=1

    //here is main logic:
    for(int i=3;i<=6;i++){
        int result=a+b; // step 3=0+1=1 // step 4=1+1=2 // step 5=1+2=3 // step 6=2+3=5
        System.out.println(result); //step 3=1 //step 4=2 //step 5=3//step 6=5;
        a=b; //step 3 (a)=1 //step 4 (a)=1 //step 5 (a)=2
        b=result; //step 3 (b)=1 //step 4 (b)=2 //step 5 (b)=3
    }
}    
}
