//Arraysorting with user inputs: 1
import java.util.Scanner;
public class ArraySortNew1 {
    public static void main(String args[]) {
        int[] arraySort = new int[10];
        for(int i=0;i<10;i++){
        System.out.print("Enter an array element at no." + i + ": ");
      Scanner input = new Scanner(System.in);
       arraySort[i] = input.nextInt();
        }
        System.out.println(" ");
        System.out.println("Array after sorting is:");
         for(int j=0; j<10; j++){
          for(int k=j+1; k<10; k++){
              int temp=0;
              if(arraySort[j]>arraySort[k]){
                  temp=arraySort[j];
                  arraySort[j]=arraySort[k];
                  arraySort[k]=temp;
                  
              }
          }
          System.out.println( arraySort[j] );
        }
    }
}





//Arraysorting with user inputs: 2
import java.util.Scanner;
public class ArraySortNew2 {
    public static void main(String args[]) {
        System.out.print("Enter number of elements in an array:");
        Scanner total = new Scanner(System.in);
       int x = total.nextInt();
        int[] arraySort = new int[x];
        System.out.println(" ");
        for(int i=0;i<x;i++){
        System.out.print("Enter an array element at no." + (i+1) + ": ");
      Scanner input = new Scanner(System.in);
       arraySort[i] = input.nextInt();
        }
        System.out.println(" ");
        System.out.println("Array after sorting in ascending order is:");
         for(int j=0; j<x; j++){
          for(int k=j+1; k<x; k++){
              int temp=0;
              if(arraySort[j]>arraySort[k]){
                  temp=arraySort[j];
                  arraySort[j]=arraySort[k];
                  arraySort[k]=temp;
                  
              }
          }
          System.out.println( arraySort[j] );
        }
    }
}
