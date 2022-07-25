//Using for loop:
import java.util.Scanner;
public class PrimeNumber1 {
    public static void main(String args[]) {
        int num;
        boolean result = false;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a prime number or not: ");
        num = input.nextInt();
        
        for ( int i=2; i <= num/2; i++){
            if(num % i == 0){
                result= true;
                break;
            }
        }
        
        if (!result){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}


/*
Output:
1.
Enter a number to check if it's a prime number or not: 51623
51623 is not a prime number.
2.
Enter a number to check if it's a prime number or not: 97
97 is a prime number.
*/



//Using while loop:
import java.util.Scanner;
public class PrimeNumber2 {
    public static void main(String args[]) {
        int num, i=2;
        boolean result = false;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a prime number or not: ");
        num = input.nextInt();
        
        while (i <= num/2){
            if(num % i == 0){
                result= true;
                break;
            } i++;
        }
        
        if (!result){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
