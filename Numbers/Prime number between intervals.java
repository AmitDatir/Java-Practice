import java.util.Scanner;
public class PrimeNumberInterval {
    public static void main(String args[]) {
        int min, max;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lower limit: ");
        min = input.nextInt();
        System.out.println("Enter a upper limit: ");
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
            System.out.println(min + ", ");
            
            ++min;
            }
        }
    }
}
