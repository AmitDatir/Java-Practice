import java.util.Scanner;

public class PrimeSum {
    public static void main(String args[]) {
        int num;
        boolean flag = false;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a sum of 2 prime numbers or not: ");
        num = input.nextInt();
        System.out.println("Following combination/s are possible: ");
        
        for (int i=2; i <= num/2; i++){
            if (isPrime(i)){
                if (isPrime(num-i)){
                    System.out.printf("%d = %d + %d\n", num, i, num-i);
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("Given number can not be expressed as sum of 2 prime numbers.");
        }
    }
    
    static boolean isPrime(int num1){
        boolean isPrime = true;
        for (int j=2; j<=num1/2; j++){
            if(num1 % j == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}



/*
Output:
1.
Enter a number to check if it is a sum of 2 prime numbers or not: 34
Following combination/s are possible: 
34 = 3 + 31
34 = 5 + 29
34 = 11 + 23
34 = 17 + 17
2.
Enter a number to check if it is a sum of 2 prime numbers or not: 27
Following combination/s are possible: 
Given number can not be expressed as sum of 2 prime numbers.
*/
