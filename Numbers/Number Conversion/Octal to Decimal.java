import java.util.Scanner;

public class OctaltoDecimal {
    public static void main(String args[]) {
        int decimal, octal; 
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter octal number to convert into decimal: ");
        octal = input.nextInt();
        
        decimal = octalToDecimal(octal);
        
        System.out.println(octal + " in octal = " + decimal + " in decimal");
    }
    
    public static int octalToDecimal(int num){
        int decimal1 = 0, i=0;
        
        while(num!=0){
            decimal1 += (num % 10) * Math.pow(8,i);
            i++;
            num /= 10;
        }
        return decimal1;
    }
}



/*
Output:
1.
Enter octal number to convert into decimal: 116
116 in octal = 78 in decimal
2.
Enter octal number to convert into decimal: 515
515 in octal = 333 in decimal
*/
