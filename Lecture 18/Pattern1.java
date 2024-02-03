public class Pattern1 {
public static void main(String args[]){
  //output:
    // *****
    // *****
    // *****
    // *****
    // *****

    //logic:
    for(int row=1;row<=5;row++){
        for(int col=1;col<=5;col++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}    
}
