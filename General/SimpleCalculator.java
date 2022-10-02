import java.util.Scanner;

public class PositiveFactors {
    public static void main(String args[]) {
        char operator;
        double num1, num2, result;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Choose the operator to perform operation +, -, *, /: ");
        operator = input.next().charAt(0);
        System.out.print("Enter 1st number: ");
        num1 = input.nextDouble();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextDouble();
        
        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("Addition operation: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Substraction operation: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication operation: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division operation: " + num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Enter a valid operator to perform operation.");
        }
    }
}



/*
Output:
1.
Choose the operator to perform operation +, -, *, /: -
Enter 1st number: 500.500
Enter 2nd number: 495
Substraction operation: 500.5 - 495.0 = 5.5
2.
Choose the operator to perform operation +, -, *, /: *
Enter 1st number: 5.4
Enter 2nd number: 2.3
Multiplication operation: 5.4 * 2.3 = 12.42
*/
