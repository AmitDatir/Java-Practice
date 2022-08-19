import java.util.Scanner;

public class OctaltoBinary {
    public static void main(String args[]) {
        int octal; 
        long binary;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter octal number to convert into binary: ");
        octal = input.nextInt();
        
        binary = octalTobinary(octal);
        
        System.out.println(octal + " in octal = " + binary + " in binary");
    }
    
    public static long octalTobinary(int num){
        int decimal1 = 0, i=0;
        long binary1 = 0;
        
        while(num!=0){
            decimal1 += (num % 10) * Math.pow(8,i);
            i++;
            num /= 10;
        }
        
        i = 1;
        while (decimal1!=0){
            binary1 += (decimal1 % 2) * i;
            i *= 10;
            decimal1 /= 2;
        }
        
        return binary1;
    }
}



/*
Output:
Enter octal number to convert into binary: 67
67 in octal = 110111 in binary
*/
