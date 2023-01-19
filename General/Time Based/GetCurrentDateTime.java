//Default format:
import java.time.LocalDateTime;

public class CurrentDateTime1 {
    public static void main(String args[]) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date & Time is: " + current);
    }
}


//Output: Current Date & Time is: 2022-09-24T18:25:03.129902674


//With pattern:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime2 {
    public static void main(String args[]) {
        LocalDateTime current = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm::ss:SSS");
        String formatted = current.format(formatter);
        System.out.println("Current Date & Time is: " + formatted);
    }
}


//Output: Current Date & Time is: 25-10-2022 14:05::00:228



//ISO Date format:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime3 {
    public static void main(String args[]) {
        LocalDateTime current = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = current.format(formatter);
        System.out.println("Current Date & Time is: " + formatted);
    }
}


//Output: Current Date & Time is: 20221025



//Localized format:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CurrentDateTime4 {
    public static void main(String args[]) {
        LocalDateTime current = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);        //Can use FULL, LONG, SHORT, MEDIUM styles
        String formatted = current.format(formatter);
        System.out.println("Current Date & Time is: " + formatted);
    }
}


/*Output:
MEDIUM: Current Date & Time is: Oct 25, 2022, 2:13:15 PM 
SHORT: Current Date & Time is: 10/25/22, 2:16 PM
*/
//check for FULL & LONG
