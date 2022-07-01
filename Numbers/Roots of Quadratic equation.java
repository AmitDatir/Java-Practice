import java.util.Scanner;
public class QuadraticRoots {
  public static void main(String[] args) {
      double a,b,c,determinant, root1,root2;
      System.out.println("Enter Coefficients of Quadratic equation: ");
          Scanner input = new Scanner(System.in);
          System.out.print("a = " ); 
          a = input.nextDouble();
          System.out.print("b = " ); 
          b = input.nextDouble();
          System.out.print("c = " ); 
          c = input.nextDouble();
        
        if(a!=0){
            determinant = b * b - 4 * a * c;
                if (determinant > 0) {
                  root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                  root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                    System.out.format("Roots of given equations are: Root1 = %.2f and Root2 = %.2f", root1, root2);
                }else if (determinant == 0) {
                  root1 = root2 = -b / (2 * a);
                  System.out.printf("Roots of given equations are: Root1 = Root2 = %.2f;", root1);
                }else {
                  double real = -b / (2 * a);
                  double imaginary = Math.sqrt(-determinant) / (2 * a);
                  System.out.format("Roots of given equations are:\n Root1 = %.2f+%.2fi", real, imaginary);
                  System.out.printf("\n Root2 = %.2f-%.2fi", real, imaginary);
                }
        }else{
            System.out.println("Not a Quadratic equation, please enter a non zero value for coefficient of 'a'.");
        }
  }
}


/*
Output:
1.
Enter Coefficients of Quadratic equation: 
a = 2.3
b = 4
c = 5.6
Roots of given equations are:
 Root1 = -0.87+1.30i
 Root2 = -0.87-1.30i
 
 2.
 Enter Coefficients of Quadratic equation: 
a = 0
b = 4
c = 6
Not a Quadratic equation, please enter a non zero value for coefficient of 'a'.

3.
Enter Coefficients of Quadratic equation: 
a = 1
b = 5
c = 6
Roots of given equations are: Root1 = -2.00 and Root2 = -3.00

4.
Enter Coefficients of Quadratic equation: 
a = 4
b = 4
c = 1
Roots of given equations are: Root1 = Root2 = -0.50;
*/
