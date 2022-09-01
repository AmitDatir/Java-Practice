import java.util.Scanner;
public class ComplexAdd{
    double real, imag;
    public ComplexAdd(double real, double imag){
            this.real = real;
            this.imag = imag;
    }
    
    public static void main(String args[]){
        double x1=0, y1=0, x2=0, y2=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st complex number ");
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.println("Enter 2nd complex number ");
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();
        
        ComplexAdd n1 = new ComplexAdd(x1,y1);
        ComplexAdd n2 = new ComplexAdd(x2,y2);
        ComplexAdd temp;
        
        temp = add(n1,n2);
        System.out.printf("Addition of given complex number is: %.1f + %.1fi", temp.real, temp.imag);
    }
    
    public static ComplexAdd add(ComplexAdd n1, ComplexAdd n2){
        ComplexAdd temp = new ComplexAdd(0.0,0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        
        return (temp);
    }
}


/*
Output:
Enter 1st complex number 
x1: 6.4
y1: 3.4
Enter 2nd complex number 
x2: 5.6
y2: 4.9
Addition of given complex number is: 12.0 + 8.3i
*/
