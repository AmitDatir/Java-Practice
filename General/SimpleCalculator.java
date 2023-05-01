import java.util.Scanner;

public class Calculator1 {
    public static void main(String args[]) {
        char operator;
        double num1, num2, result;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Choose the operator to perform operation +, -, *, /");
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



import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else{
                        ans = 0;
                        System.out.println("Please enter numbers greater than 0");
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;               //Ends the program
            } else {
                System.out.println("Invalid operation entered!");
            }
            
            System.out.println("Answer = " + ans);
        }
    }
}


/*
Output:
Enter the operator: *
Enter two numbers: 
125
94
Answer = 11750
Enter the operator: /
Enter two numbers: 
654
0
Please enter numbers greater than 0
Answer = 0
Enter the operator: -
Enter two numbers: 
56318
62
Answer = 56256
Enter the operator: +
Enter two numbers: 
2
3
Answer = 5
Enter the operator: X
*/
