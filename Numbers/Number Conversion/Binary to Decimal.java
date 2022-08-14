import java.util.Scanner;

public class BinarytoDecimal1 {
    public static void main(String args[]) {
        long binary;
        int decimal; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number to convert into decimal: ");
        binary = input.nextLong();
        
        decimal = binaryToDecimal(binary);
        
        System.out.println(binary + " in binary = " + decimal + " in decimal");
    }
    
    public static int binaryToDecimal(long num){
        int decimal = 0, i=0;
        long remainder;
        
        while(num!=0){
            remainder = num % 10;
            num /= 10;
            decimal += remainder * Math.pow(2,i);
            i++;
     
        }
        return decimal;
    }
}



/*
Output:
1.
Enter binary number to convert into decimal: 110110111
110110111 in binary = 439 in decimal
2.
Enter binary number to convert into decimal: 11100011
1115600011 in binary = 1411 in decimal
*/






//Using parseInt method:
import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String args[]) {
        String binary;
        int decimal; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number to convert into decimal: ");
        binary = input.next();
        
        decimal = Integer.parseInt(binary,2); // binary value should be in String to use this method
        
        System.out.println(binary + " in binary = " + decimal + " in decimal");
    }
}
