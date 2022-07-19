//using while loop & no Math.pow() method:
import java.util.Scanner;
public class Power1 {
    
    private int result=1;
    
    public static void main(String args[]) {
        
        double base, exponent;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        base = input.nextDouble();
        System.out.print("Enter the exponent number: ");
        exponent = input.nextDouble();
        
        Power1 p1 = new Power1();
        p1.setPower(base,exponent);
    
        System.out.println("Power of base " + base + " & exponent " + exponent + " is: " + p1.getPower());
    }
        
    public void setPower(double a, double b){
        while (b!=0){
            result*=a;
            b--;
        }
    }
    
    public double getPower(){
        return result;
    }
    
}



/*
Output:
Enter the base number: 5
Enter the exponent number: 3
Power of base 5.0 & exponent 3.0 is: 125.0
*/
