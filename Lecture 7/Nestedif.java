class Nestedif{
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c=30;
        if(a>b){
            if(a>c){
               System.out.println("true");   
            }
        }
        else{
            System.out.println("false");
        }
    }
}