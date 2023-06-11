import java.util.Scanner;

public class PrimeNumberInterval1 {
    public static void main(String args[]) {
        int min, max;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lower limit: ");
        min = input.nextInt();
        System.out.print("Enter a upper limit: ");
        max = input.nextInt();
        
        while (min<max){
            boolean result = false;
            for (int i=2; i<=min/2; i++){
                if(min%i==0){
                    result = true;
                    break;
                }
            }
            if (!result && min != 0 && min != 1){
            System.out.print(min + " ");
            }
            ++min;
        }
    }
}


/*
Output:
Enter a lower limit: 0
Enter a upper limit: 50
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
*/



//Using method to find prime number:
import java.util.Scanner;

public class PrimeNumberInterval2 {
    public static void main(String args[]) {
        int min, max;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lower limit: ");
        min = input.nextInt();
        System.out.print("Enter a upper limit: ");
        max = input.nextInt();
        
        while (min<max){
            if (isPrime(min)){
            System.out.print(min + " ");
            }
            ++min;
        }
    }
    
    static boolean isPrime(int prime){
        boolean result = true;
        for (int i=2; i<=prime/2; i++){
            if(prime % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
}
