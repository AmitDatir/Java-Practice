//Without using GCD:
import java.util.Scanner;
public class LCM1 {

    public static void main(String args[]) {
        int number1, number2,lcm;
        System.out.println("Enter 2 numbers to find LCM.");
        Scanner input = new Scanner(System.in);
        System.out.print("1st: ");
        number1 = input.nextInt();
        System.out.print("2nd: ");
        number2 = input.nextInt();
        
        lcm = (number1 > number2) ? number1 : number2;
        
        while(true){
            if(lcm % number1 == 0 && lcm % number2 == 0){
                System.out.printf("LCM of numbers %d & %d is: %d", number1, number2, lcm);
                break;
            } lcm++;
        }
    }
}


/*
Output:
1.
Enter 2 numbers to find LCM.
1st: 72
2nd: 120
LCM of numbers 72 & 120 is: 360

2.
Enter 2 numbers to find LCM.
1st: 81
2nd: 153
LCM of numbers 81 & 153 is: 1377
*/


//With using GCD:
import java.util.Scanner;
public class LCM2 {

    public static void main(String args[]) {
        int number1, number2,gcd = 1,lcm;
        System.out.println("Enter 2 numbers to find LCM.");
        Scanner input = new Scanner(System.in);
        System.out.print("1st: ");
        number1 = input.nextInt();
        System.out.print("2nd: ");
        number2 = input.nextInt();
        
        for (int i=1; i <= number1 && i <= number2; i++){
            if(number1 % i == 0 && number2 % i == 0){
                gcd = i;
            }
        }
        
        lcm = (number1 * number2) / gcd;
        System.out.printf("GCD & LCM of two numbers %d & %d is: %d & %d", number1, number2, gcd, lcm);
    }
}

/*
Output:
Enter 2 numbers to find LCM.
1st: 81
2nd: 153
GCD & LCM of two numbers 81 & 153 is: 9 & 1377
*/
