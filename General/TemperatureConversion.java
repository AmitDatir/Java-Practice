import java.util.Scanner;

public class TempConvert {
    public static void main(String args[]) {
        System.out.println("Select conversion option to proceed: \n1. Celsius to Farenheit \n2. Farenheit to Celsius");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        
        if(option == 1){
            System.out.println("Enter temperature in Celsius: ");
            float tempC = input.nextFloat();
            float tempF = (tempC * 9 / 5) + 32;
            System.out.println("Temperature in Farenheit: " + tempF);
        } else if(option == 2){
            System.out.println("Enter temperature in Farenheit: ");
            float tempF = input.nextFloat();
            float tempC= (tempF - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + tempC);
        } else{
            System.out.println("Enter correct option.");
        }
    }
}


/*
Output:
1.
Select conversion option to proceed: 
1. Celsius to Farenheit 
2. Farenheit to Celsius
1
Enter temperature in Celsius: 
40
Temperature in Farenheit: 104.0

2.
Select conversion option to proceed: 
1. Celsius to Farenheit 
2. Farenheit to Celsius
2
Enter temperature in Farenheit: 
104
Temperature in Celsius: 40.0

3.
Select conversion option to proceed: 
1. Celsius to Farenheit 
2. Farenheit to Celsius
6
Enter correct option.
*/
