//using for loop:
import java.util.Scanner;
public class SumNatural {

    public static void main(String args[]) {
        int num,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number upto which we need to find sum of natural numbers: ");
        num = input.nextInt();
        
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}



/*
Output:
Enter a number upto which we need to find sum of natural numbers: 100
Sum of numbers is: 5050
*/



//Using while loop:
import java.util.Scanner;

public class SumNatural {

    public static void main(String args[]) {
        int num,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number upto which we need to find sum of natural numbers: ");
        num = input.nextInt();
        
        int i = 1; 
        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}


//Using Recursion:
import java.util.Scanner;

public class NaturalSum {
    public static void main(String args[]) {
        int num; 
        long result;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a last natural number to find sum: ");
        num = input.nextInt();
        
        result = sum(num);
        System.out.println("Sum upto number " + num + " = " + result);
    }
    
    static long sum(int num1){
        if (num1 != 0){
            long sum1 = num1 + sum(num1-1);
            return sum1;
        } else{
            return num1;
        }
    }
}


/*
Output:
Enter a last natural number to find sum: 100
Sum upto number 100 = 5050
*/
