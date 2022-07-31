import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        int num, original, remainder, result=0,n=0;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number or not: ");
        num = input.nextInt();
        original=num;
        
        for(; original!=0; original/=10,n++);
        original=num;
        
        for(;original!=0; original/=10){
            remainder = original % 10;
            result+= Math.pow(remainder,n);
        }
        
        if(num==result){
            System.out.println(num + " is an Armstrong number.");
        } else{
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}



/*
Output:
1.
Enter a number to check if it is an Armstrong number or not: 153
153 is an Armstrong number.
2.
Enter a number to check if it is an Armstrong number or not: 1634
1634 is an Armstrong number.
3. 
Enter a number to check if it is an Armstrong number or not: 1633
1633 is not an Armstrong number.
*/
