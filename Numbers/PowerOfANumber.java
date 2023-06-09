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



//Using for loop:
import java.util.Scanner;

public class Power2 {
    
    private int result=1;
    
    public static void main(String args[]) {
        
        double base, exponent;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        base = input.nextDouble();
        System.out.print("Enter the exponent number: ");
        exponent = input.nextDouble();
        
        Power2 p2 = new Power2();
        p2.setPower(base,exponent);
    
        System.out.println("Power of base " + base + " & exponent " + exponent + " is: " + p2.getPower());
    }
        
    public void setPower(double a, double b){
        for (; b!=0; b--){
            result*=a;
        }
    }
    
    public double getPower(){
        return result;
    }
    
}



//Using pow() function:
import java.util.Scanner;

public class Power3 {
    
    public static void main(String args[]) {
        
        double base, exponent;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        base = input.nextDouble();
        System.out.print("Enter the exponent number: ");
        exponent = input.nextDouble();
        
        System.out.printf("Power of base " + base + " & exponent " + exponent + " is: " + Math.pow(base,exponent));
    }
}




///Using Recursion:
import java.util.Scanner;

public class Power4 {
    
    public static void main(String args[]) {
        
        int base, exponent, result;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        base = input.nextInt();
        System.out.print("Enter the exponent number: ");
        exponent = input.nextInt();
        
        result = power(base, exponent);
        System.out.printf(base + "^" + exponent + " = " + result);
    }
    
    public static int power(int base1, int exponent1){
        if(exponent1 != 0){
            return (base1 * power (base1, exponent1-1));
        } else{
            return 1;
        }
    }
}



/*
Output:
Enter the base number: 5
Enter the exponent number: 5
5^5 = 3125
*/
