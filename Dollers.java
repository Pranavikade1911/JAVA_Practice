import java.util.*;

class Doller{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Amount in USD: ");
        double USD = sc.nextDouble();
        
        double INR = 82.63 * USD;
        
        System.out.println(""+USD+" USD in INR is equal to Rs "+INR);
        
    }
    
}