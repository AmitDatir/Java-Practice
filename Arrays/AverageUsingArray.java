import java.util.Scanner;

public class Average {
    
    public static void main(String args[]) {
        double average, sum = 0.0;
        double arr[] = new double[]{50.6, 24.3, 69, 96.5, 52.4, 78.6, 12.9};
        
        System.out.println("Given array elements are: 50.6, 24.3, 69, 96.5, 52.4, 78.6, 12.9.");
        
        for (double num: arr){
            sum += num;
        }
        average = sum / arr.length;
        
        System.out.println("The average of given elements: " + average);
    }
}


/*
Output:
Given array elements are: 50.6, 24.3, 69, 96.5, 52.4, 78.6, 12.9.
The average of given elements: 54.89999999999999
*/
