import java.util.Scanner;

public class ArmstrongNumber1 {
    public static void main(String args[]) {
        int min,max, num, original, remainder;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lower limit to find Armstrong numbers: ");
        min = input.nextInt();
        System.out.print("Enter a upper limit: ");
        max = input.nextInt();
        
        if (min/10 != 0 || max/10 != 0){
            System.out.print("\nArmstrong numbers between given numbers are: ");
            
            for (num = min; num < max; num++){
                int result = 0, n = 0;
                original = num;
                
                while (original!=0){
                    original/=10;
                    n++;
                }
                original = num;
                
                while (original!=0){
                    remainder = original % 10;
                    result += Math.pow(remainder,n);
                    original/=10;
                }
                
                if (result == num){
                    System.out.print(num + " ");
                }
            } 
            
        } else {
            System.out.println("Enter limits greater than 9.");
        }    
    }
}



/*
Output:
1.
Enter a lower limit to find Armstrong numbers: 562
Enter a upper limit: 15239

Armstrong numbers between given numbers are: 1634 8208 9474 
2.
Enter a lower limit to find Armstrong numbers: 5
Enter a upper limit: 1526
Enter limits greater than 9.
*/




import java.util.Scanner;

public class ArmstrongNumber2 {
    public static void main(String args[]) {
        int min,max, num;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lower limit to find Armstrong numbers: ");
        min = input.nextInt();
        System.out.print("Enter a upper limit: ");
        max = input.nextInt();
        
        if (min/10 != 0 || max/10 != 0){
            System.out.print("\nArmstrong numbers between given numbers are: ");
            
            for (num = min; num < max; num++){
                
                if (isArmstrong(num)){
                    System.out.print(num + " ");
                }
            }
        }
        else {
            System.out.println("Enter limits greater than 9.");
        }
    }
    
    static boolean isArmstrong(int arm){
        int result = 0, n = 0, original = arm;
                
        while (original!=0){
            original/=10;
            n++;
        }
        original = arm;
                
        while (original!=0){
            int remainder = original % 10;
                result += Math.pow(remainder,n);
                original/=10;
            }
                
            if (result == arm){
                return true;
            } 
            else {
                return false;
            }
    }
}
