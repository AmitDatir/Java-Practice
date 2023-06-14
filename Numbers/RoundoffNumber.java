//using format or printf:
public class Round1 {
    public static void main(String args[]) {
        double num = 62.1562645862;
        System.out.printf("%.4f", num);
    }
}

/*
Output:
62.1563
*/


//Using Decimal format:
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Round2 {
    public static void main(String args[]) {
        double num = 62.1562445862;
        DecimalFormat df = new DecimalFormat("#.####");       //4 * # denotes to round off upto 4 digits
        df.setRoundingMode(RoundingMode.CEILING);             //to round of last digit to next digit
        System.out.println(df.format(num));
    }
}



/*
Output:
62.1563
*/
