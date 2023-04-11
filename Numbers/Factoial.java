//Using for loop & small numbers:
import java.util.Scanner;

public class Factorial1 {

    public static void main(String args[]) {
        int number;
        long factorial = 1;
        System.out.print("Enter a number to find factorial: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        for (int i = 1; i<=number; i++){
            factorial *=i;
        }
        System.out.printf("Factorial of number %d is: %d" , number, factorial);
        input.close();
    }
}
//We can not find factorial of big numbers using long(can not store very big number), so we need to use Big Integer.



/*
Output:
1.
Enter a number to find factorial: 10
Factorial of number 10 is: 3628800

2.
Enter a number to find factorial: 30
Factorial of number 30 is: -8764578968847253504
*/



//Using Big-Integer:
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial2 {

    public static void main(String args[]) {
        int number;
        BigInteger factorial = BigInteger.ONE; //assigning value to 1
        System.out.print("Enter a number to find factorial: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        for (int i = 1; i<=number; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i)); //can not use * with BigInteger & need to cast number to BigInteger
        }
        System.out.printf("Factorial of number %d is: %d" , number, factorial);
        input.close();
    }
}



/*
Output:
1.
Enter a number to find factorial: 30
Factorial of number 30 is: 265252859812191058636308480000000

2.
Enter a number to find factorial: 50
Factorial of number 50 is: 30414093201713378043612608166064768844377641568960512000000000000
*/


//Using while loop:
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial3 {

    public static void main(String args[]) {
        int number;
        BigInteger factorial = BigInteger.ONE; //assigning value to 1
        System.out.print("Enter a number to find factorial: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        int i=1;
        while (i<=number){
            factorial = factorial.multiply(BigInteger.valueOf(i)); //can not use * with BigInteger & need to cast number to BigInteger
            i++;
        }
        System.out.printf("Factorial of number %d is: %d" , number, factorial);
        input.close();
    }
}




//Using recursion:
import java.util.Scanner;

public class Factorial4 {
    public static void main(String args[]) {
        int num; 
        long result;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        num = input.nextInt();
        
        result = factorial(num);
        System.out.println(num + "! = " + result);
    }
    
    static long factorial(int num1){
        if (num1 != 0){
            long fact = num1 * factorial(num1-1);
            return fact;
        } else{
            return 1;
        }
    }
}


/*
Output:
Enter a number to find factorial: 20
20! = 2432902008176640000
*/
