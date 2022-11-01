import java.util.Scanner;

public class BinarytoOctal {
    public static void main(String args[]) {
        long binary;
        int octal; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number to convert into octal: ");
        binary = input.nextLong();
        
        octal = binaryToOctal(binary);
        
        System.out.println(binary + " in binary = " + octal + " in octal");
    }
    
    public static int binaryToOctal(long num){
        int octal1 = 0, decimal = 0, i=0;
        long remainder;
        
        while(num!=0){
            remainder = num % 10;
            decimal += (num % 10) * Math.pow(2,i);
            num /= 10;
            i++;
        }
        
        i = 1;
        while(decimal!=0){
            octal1 = (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        
        return octal1;
    }
}


/*
Output:
Enter binary number to convert into octal: 101001
101001 in binary = 50 in octal
*/
