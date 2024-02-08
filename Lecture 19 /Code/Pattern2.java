public class Pattern2 {
public static void main(String args[]){
    //output: 
    //*
    //**
    //***
    //****
    //***** 

    //logic:
    for(int row=1;row<=5;row++){
        for(int col=1;col<=row;col++){
            System.out.print("*");
        }
        System.out.println();
    }
}    
}
