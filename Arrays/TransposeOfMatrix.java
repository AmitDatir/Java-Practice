import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String args[]) {
        int x,y;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter dimensions of matrix:" );
        System.out.print("x: ");
        x =  input.nextInt();
        System.out.print("y: ");
        y =  input.nextInt();
        
        int mat[][] = new int[x][y];
        System.out.println("Enter elements from Matrix:");
        for(int i=0; i<x; i++){
            for (int j=0; j<y; j++){                    
                mat[i] [j] = input.nextInt();
            }
        }
        System.out.println("Given matrix is:");
        display(mat);
            
        int transpose[][] = new int[y][x];
        for(int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                transpose[j][i] = mat[i][j];
            }
        }
            
        System.out.println("Transpose of given matrix is:");
        display(transpose);
    }
    
    public static void display(int[][] matrix){
        for(int row[] : matrix){
            for(int column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}




/*
Output:
1.
Enter dimensions of matrix:
x: 3
y: 3
Enter elements from Matrix:
1
2
3
4
5
6
7
8
9
Given matrix is:
1 2 3 
4 5 6 
7 8 9 
Transpose of given matrix is:
1 4 7 
2 5 8 
3 6 9 

2.
Enter dimensions of matrix:
x: 3
y: 2
Enter elements from Matrix:
1
2
3
4
5
6
Given matrix is:
1 2 
3 4 
5 6 
Transpose of given matrix is:
1 3 5 
2 4 6 
*/
