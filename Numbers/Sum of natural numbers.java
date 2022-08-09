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
