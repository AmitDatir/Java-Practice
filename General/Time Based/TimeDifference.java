//24 Hours format:
import java.util.Scanner;

public class Time{
    int hour, min, sec;
    public Time(int hour, int min, int sec){
            this.hour = hour;
            this.min = min;
            this.sec = sec;
    }
    
    public static void main(String args[]){
        int hh1=0, mm1=0, ss1=0, hh2=0, mm2=0, ss2=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Start Time: ");
        System.out.print("hh1: ");
        hh1 = input.nextInt();
        System.out.print("mm1: ");
        mm1 = input.nextInt();
        System.out.print("ss1: ");
        ss1 = input.nextInt();
        System.out.println("Enter Stop Time: ");
        System.out.print("hh2: ");
        hh2 = input.nextInt();
        System.out.print("mm2: ");
        mm2 = input.nextInt();
        System.out.print("ss2: ");
        ss2 = input.nextInt();
        
        Time start = new Time(hh1,mm1,ss1);
        Time stop = new Time(hh2,mm2,ss2);
        Time diff;
        
        diff = difference(start,stop);
        System.out.printf("Time difference: %d:%d:%d - ", stop.hour, stop.min, stop.sec);
        System.out.printf("%d:%d:%d", start.hour, start.min, start.sec);
        System.out.printf(" = %d:%d:%d", diff.hour, diff.min, diff.sec);
        
    }
    
    public static Time difference(Time start, Time stop){
        Time diff = new Time(0,0,0);
        
        if(start.sec > stop.sec){
            --stop.min;
            stop.sec+=60;
        }
        diff.sec = stop.sec - start.sec;
        
        if(start.min > stop.min){
            --stop.hour;
            stop.min+=60;
        }
        diff.min = stop.min - start.min;
        
        diff.hour = stop.hour - start.hour;
        
        return (diff);
    }
}


/*
output:
Enter Start Time: 
hh1: 8
mm1: 12
ss1: 15
Enter Stop Time: 
hh2: 12
mm2: 34
ss2: 55
Time difference: 12:34:55 - 8:12:15 = 4:22:40
*/
