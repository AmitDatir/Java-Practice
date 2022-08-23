import java.util.Scanner;
public class StandardDeviation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements to find standard deviation:");
        int x = input.nextInt();
        double arr[] = new double[x];
        
        System.out.print("Enter " + x + " numbers to find standard deviation: ");
        for(int i=0; i<x; i++){
            arr[i] = input.nextDouble();
        }
        
        double sd = sdCalculator(arr);
        System.out.printf("Standard deviation for given numbers is: %.6f ", sd );
    }
    
    public static double sdCalculator(double arr[]){
        double sum = 0.0, variance = 0.0, var1 = 0.0;
        
        for ( double num : arr){
            sum += num;
        }
        double mean = sum / arr.length;
        
        for ( double num : arr){
            var1 += Math.pow(num - mean, 2);
        }
        variance = var1 / arr.length;
        
        return Math.sqrt(variance);
    }
}



/*
Output:
Enter number of elements to find standard deviation:10
Enter 10 numbers to find standard deviation: 1
2
3
4
5
6
7
8
9
10
Standard deviation for given numbers is: 2.872281 
*/
