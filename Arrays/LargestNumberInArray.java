import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter elements inside an array:");
        int x = input.nextInt();
        double arr[] = new double[x];
        for(int i=0; i<x; i++){
            arr[i] = input.nextDouble();
        }
        
        double largest = arr[0];
        for (double num : arr){
            if (largest < num){
                largest = num;
            }
        }
        System.out.println("Largest element in array is: " + largest );
    }
}


/*
Output:
Enter number of elements inside an array:4
Enter elements inside an array: 62
62.3
62.33
62.333
Largest element in array is: 62.333
*/



//Find minimum number from array & locate maximum number from that column
import java.util.Scanner;

public class InterviewMinnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows= input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols= input.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.print("Enter elements inside an array:\n");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = input.nextInt();
            }
        }
        
        int min = arr[0][0];
        int minCol = 0;

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                    minCol = j;
                }
            }
        }
        
        int max = arr[0][minCol];
        int k = 0;
        while (k < cols) {
            if (arr[k][minCol] > max) {
                max = arr[k][minCol];
            }
            k++;
        }
        System.out.println("Maximum number from column of minimum number = " + max);
    }

}

/*
Output:
Enter number of rows: 3
Enter number of columns: 3
Enter elements inside an array:
10
5
2
4
9
6
0
5
3
Maximum number from column of minimum number = 10
*/




//Robust & Scalable Version:
public class InterviewMinNumber {

    public static void main(String[] args) {

        int[][] abc = {
            {2, 4, 5},
            {3, 2, 10},
            {1, 2, 0}
        };

        // Edge case: check if matrix is empty or improperly formed
        if (abc == null || abc.length == 0 || abc[0].length == 0) {
            System.out.println("Invalid matrix input.");
            return;
        }

        int rows = abc.length;
        int cols = abc[0].length;

        int min = abc[0][0];
        int minColumn = 0;

        // Find the column of the minimum element in the matrix
        for (int i = 0; i < rows; i++) {
            if (abc[i].length != cols) {
                System.out.println("Jagged arrays are not supported.");
                return;
            }
            for (int j = 0; j < cols; j++) {
                if (abc[i][j] < min) {
                    min = abc[i][j];
                    minColumn = j;
                }
            }
        }

        // Find the maximum value in the column that contains the minimum value
        int maxInMinColumn = abc[0][minColumn];
        for (int i = 1; i < rows; i++) {
            if (abc[i][minColumn] > maxInMinColumn) {
                maxInMinColumn = abc[i][minColumn];
            }
        }

        System.out.println("Maximum in column containing minimum element: " + maxInMinColumn);
    }
}


