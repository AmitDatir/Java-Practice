import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]) {
        int year;
        boolean leap = false;
        System.out.print("Enter a year to check: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}





/*
Output:
1.
Enter a year to check: 1111
1111 is not a leap year.

2.
Enter a year to check: 13
13 is not a leap year.

3.
Enter a year to check: 1900
1900 is not a leap year.

4.
Enter a year to check: 2020
2020 is a leap year.
*/
