import java.util.Scanner;
public class MatrixAdd {
    public static void main(String args[]) {
        int x,y;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter dimensions of matrix to find addition:" );
        System.out.print("x: ");
        x =  input.nextInt();
        System.out.print("y: ");
        y =  input.nextInt();
        
        int mat1[][] = new int[x][y];
        int mat2[][] = new int[x][y];
        System.out.println("Enter elements from 1st Matrix:");
        for(int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                mat1[i] [j] = input.nextInt();
            }
        }
        
        System.out.println("Enter elements from 2nd Matrix:");
        for(int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                mat2[i] [j] = input.nextInt();
            }
        }
        
        int sum[][] = new int[x][y];
        for(int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Addition of given 2 matrices is:");
        for(int row[] : sum){
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}



/*
Output:
Enter dimensions of matric to find addition:
x: 2
y: 2
Enter elements from 1st Matrix:
11
22
33
44
Enter elements from 2nd Matrix:
11
22
33
44
Addition of given 2 matrices is:
22 44 
66 88
*/
