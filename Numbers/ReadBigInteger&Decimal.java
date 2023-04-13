import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class bigIntegereDecimal {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
          System.out.print("Enter a big integer: ");
          BigInteger bigInt = input.nextBigInteger();
            System.out.println("Big integer value entered is: " + bigInt);
          System.out.print("Enter a big decimal: ");
          BigDecimal bigDec = input.nextBigDecimal();
            System.out.println("Big decimal value entered is: " + bigDec);
   }
}



/*Output:
Enter a big integer: 163248952334
Big integer value entered is: 163248952334
Enter a big decimal: 130.1896231923
Big decimal value entered is: 130.1896231923
*/
