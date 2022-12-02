import java.util.Scanner;
public class MatrixMultiply {
    public static void main(String args[]) {
        int x1,y1,x2,y2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter dimensions of 1st matrix:" );
        System.out.print("x1: ");
        x1 =  input.nextInt();
        System.out.print("y1: ");
        y1 =  input.nextInt();
        
        System.out.println("Enter dimensions of 2nd matrix:" );
        System.out.print("x2: ");
        x2 =  input.nextInt();
        System.out.print("y2: ");
        y2 =  input.nextInt();
        
        int mat1[][] = new int[x1][y1];
        int mat2[][] = new int[x2][y2];
        
        if(y1 == x2){
            System.out.println("Enter elements from 1st Matrix:");
            for(int i=0; i<x1; i++){
                for (int j=0; j<y1; j++){
                    mat1[i] [j] = input.nextInt();
                }
            }
            
            System.out.println("Enter elements from 2nd Matrix:");
            for(int i=0; i<x2; i++){
                for (int j=0; j<y2; j++){
                    mat2[i] [j] = input.nextInt();
                }
            }
            
            int multi[][] = new int[x1][y2];
            for(int i=0; i<x1; i++){
                for (int j=0; j<y2; j++){
                    for(int k=0; k<y1; k++){
                        multi[i][j] += mat1[i][k]* mat2[k][j];
                    }
                }
            }
            System.out.println("Multiplication of given 2 matrices is:");
            for(int row[] : multi){
                for(int column : row){
                    System.out.print(column + " ");
                }
                System.out.println();
            }
        } else{
            System.out.println("Multiplication is not possible for given sets of matrix dimensions");
        }
    }
}



/*
Output:
1.
Enter dimensions of 1st matrix:
x1: 2
y1: 3
Enter dimensions of 2nd matrix:
x2: 3
y2: 2
Enter elements from 1st Matrix:
3
-2
5
3
0
4
Enter elements from 2nd Matrix:
2
3
-9
0
0
4
Multiplication of given 2 matrices is:
24 29 
6 25 

2.
Enter dimensions of 1st matrix:
x1: 2
y1: 2
Enter dimensions of 2nd matrix:
x2: 1
y2: 3
Multiplication is not possible for given sets of matrix dimensions
*/
