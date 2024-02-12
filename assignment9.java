public class assignment9 {
    public static void main(String[] args) {      
    
    int firstArg;
    
    firstArg = Integer.parseInt(args[0]);
        
                
    
    int num = 0, num1=1;
    for (int i=0; i < firstArg-1; i++){
        int num2 =num1+num;
        num=num1;
        num1=num2;
    }
    System.out.println(num1);
    }
    
}