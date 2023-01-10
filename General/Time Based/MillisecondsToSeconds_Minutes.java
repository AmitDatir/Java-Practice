//Using toSeconds & toMinutes methods:
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Milli1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of milliseconds to calculate seconds & minutes: ");
        long milli = input.nextLong();
        
        long seconds = TimeUnit.MILLISECONDS.toSeconds(milli);
        System.out.println(milli + " Millseconds = " + seconds + " Seconds");
        
        long minutes = TimeUnit.MILLISECONDS.toMinutes(milli);
        System.out.println(milli + " Millseconds = " + minutes + " Minutes");
    }
}


/*
Output:
Enter number of milliseconds to calculate seconds & minutes: 1000000
1000000 Millseconds = 1000 Seconds
1000000 Millseconds = 16 Minutes
*/




//Using mathematical formula:
import java.util.Scanner;
public class Milli2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of milliseconds to calculate seconds & minutes: ");
        long milli = input.nextLong();
        
        long seconds = (milli / 1000);
        System.out.println(milli + " Millseconds = " + seconds + " Seconds");
        
        long minutes = (milli / 1000) / 60;
        System.out.println(milli + " Millseconds = " + minutes + " Minutes");
    }
}
