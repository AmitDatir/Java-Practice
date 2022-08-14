import java.util.Scanner;

public class DecimaltoBinary1 {
    public static void main(String args[]) {
        long binary;
        int decimal; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number to convert into binary: ");
        decimal = input.nextInt();
        
        binary = decimalToBinary(decimal);
        
        System.out.println(decimal + " in decimal = " +  binary + " in binary");
    }
    
    public static long decimalToBinary(int num){
        long binary = 0;
        int i=1, remainder;
        
        while(num!=0){
            remainder = num % 2;
            num /= 2;
            binary += remainder * i;
            i *= 10;
     
        }
        return binary;
    }
}






//Using toBinaryString() method:
import java.util.Scanner;

public class DecimalToBinary2 {
    public static void main(String args[]) {
        int decimal; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal to convert into binary: ");
        decimal = input.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        System.out.println(decimal + " in decimal = " + binary + " in binary");
    }
}



/*
Output:
1.
Enter decimal to convert into binary: 81
81 in decimal = 1010001 in binary
2.
Enter decimal number to convert into binary: 55
55 in decimal = 110111 in binary
*/
