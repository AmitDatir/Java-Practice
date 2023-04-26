//predefined formatters:
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeString1 {
    public static void main(String args[]) {
        String str = "2022-09-15";
        LocalDate date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
        
        System.out.println(date);
    }
}


/*
Output:
2022-09-15
*/



//pattern formatters:
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class TimeString2 {
    public static void main(String args[]) {
        String str = "September 15, 2022";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(str, formatter);
        
        System.out.println(date);
    }
}


/*
Output:
2022-09-15
*/
