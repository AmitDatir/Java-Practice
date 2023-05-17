import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    Scanner input = new Scanner(System.in);
    void bubbleSort(int arr[]){
        int size = arr.length;
        System.out.println("Choose sorting order: \n 1 for Ascending \n 2 for descending");
        int sortInput = input.nextInt();
        
        for(int i=0; i< size-1; i++){
            for(int j=0; j< size-i-1; j++){
                if(sortInput == 1){
                    if(arr[j] > arr[j+1]){             //ascending
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                else if(arr[j] < arr[j+1]){           //descending
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String args[]) {
        int data[] = {-62, 12, 64, 85, 16233, 1, 0, -5};
        BubbleSort bs1 = new BubbleSort();
        bs1.bubbleSort(data);
        System.out.println("Sorted Array in selected order: " + Arrays.toString(data));
    }
}


/*
Output:
1. Ascending:
Choose sorting order: 
 1 for Ascending 
 2 for descending
1
Sorted Array in selected order: [-62, -5, 0, 1, 12, 64, 85, 16233]

2.
Descending:
Choose sorting order: 
 1 for Ascending 
 2 for descending
2
Sorted Array in selected order: [16233, 85, 64, 12, 1, 0, -5, -62]
*/
