//Using toBinaryString() method:
import java.util.Scanner;

public class HCF4 {
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
Enter decimal to convert into binary: 81
81 in decimal = 1010001 in binary
*/
