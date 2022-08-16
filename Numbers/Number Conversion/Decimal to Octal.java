import java.util.Scanner;

public class DecimaltoOctal {
    public static void main(String args[]) {
        int decimal, octal; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal number to convert into octal: ");
        decimal = input.nextInt();
        
        octal = decimalToOctal(decimal);
        
        System.out.println(decimal + " in decimal = " +  octal + " in octal");
    }
    
    public static int decimalToOctal(int num){
        int i=1, octal1=0;
        
        while(num!=0){
            octal1 += (num % 8) * i;
            num /= 8;
            i *= 10;
        }
        return octal1;
    }
}


/*
Output:
1.
Enter decimal number to convert into octal: 78
78 in decimal = 116 in octal
2.
Enter decimal number to convert into octal: 333
333 in decimal = 515 in octal
*/
