public class LargestSumEqual {
        public static void main(String args[]){
            int number1 = 2;
            int number2 = 2;
            int number3 = 2;
    
            //condition for finding largest number begins here: 
    
            if(number1>=number2){
                if(number1>=number3){
                    System.out.println("Number1 is Greatest "+number1);
                }
            }
    
            else if(number2>=number3){
                System.out.println("Number2 is Greatest "+number2);
                }
            else{
                System.out.println("number 3 is greatest: "+number3);
            }
        }
    
}
