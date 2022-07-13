//with for loop & if statement:
import java.util.Scanner;
public class HCF {

    public static void main(String args[]) {
        int number1, number2,hcf = 1;
        System.out.println("Enter 2 numbers to find HCF.");
        Scanner input = new Scanner(System.in);
        System.out.print("1st: ");
        number1 = input.nextInt();
        System.out.print("2nd: ");
        number2 = input.nextInt();
        
        for (int i =1; i<=number1 && i<=number2; i++){
            if(number1 % i ==0 && number2 % i ==0){
                hcf =i;
            }
        }
        System.out.println("HCF/GCD of numbers " + number1 + " & " + number2 + " : " + hcf);
    }
}


/*
Output:
1. 
Enter 2 numbers to find HCF.
1st: 155
2nd: 75
HCF/GCD of numbers 155 & 75 : 5
2.
Enter 2 numbers to find HCF.
1st: 257
2nd: 83
HCF/GCD of numbers 257 & 83 : 1
*/
  
