import java.util.Scanner;

public class OddNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lowest limit: ");
        int low = input.nextInt();
        System.out.println("Enter highest limit: ");
        int high = input.nextInt();
        
        int oddNum = countOdd(low, high);
        System.out.println("Number of odd numbers between given limit: " + oddNum);
    }
    
    public static int countOdd(int low, int high){
        int temp = high - low + 1;
        if(low % 2 == 0 || high % 2 == 0){
            return temp/2;
        } else{
            return (temp/2) + 1;
        }
    }
}


/*
Output:
1.
Enter lowest limit: 
3
Enter highest limit: 
11
Number of odd numbers between given limit: 5
2.
Enter lowest limit: 
2
Enter highest limit: 
10
Number of odd numbers between given limit: 4
3.
Enter lowest limit: 
2
Enter highest limit: 
11
Number of odd numbers between given limit: 5
*/
