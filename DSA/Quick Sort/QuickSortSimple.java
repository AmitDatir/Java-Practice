import java.util.Arrays;

class Quicksort {
  static int partition(int array[], int low, int high) {               // method to find the partition position
    int pivot = array[high];                                           // choose the rightmost element as pivot
    int i = (low - 1);                                                 // pointer for greater element
    
    for (int j = low; j < high; j++) {                                 // traverse through all elements & compare each element with pivot
      if (array[j] <= pivot) {
        i++;                                          // if element smaller than pivot is found, swap it with the greater element pointed by i

        int temp = array[i];                      // swapping element at i with element at j
        array[i] = array[j];
        array[j] = temp;
      }
    }
    int temp = array[i + 1];                  // swapt the pivot element with the greater element specified by i
    array[i + 1] = array[high];
    array[high] = temp;

    return (i + 1);                          // return the position from where partition is done
  }
  
  static void quickSort(int array[], int low, int high) {
    if (low < high) {
      int pi = partition(array, low, high);           // find pivot element such that elements smaller than pivot are on the left elements greater than pivot are on the right
      quickSort(array, low, pi - 1);                  // recursive call on the left of pivot
      quickSort(array, pi + 1, high);                // recursive call on the right of pivot
    }
  }
}

public class Main {
  public static void main(String args[]) {

    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array");
    System.out.println(Arrays.toString(data));

    int size = data.length;

    Quicksort.quickSort(data, 0, size - 1);

    System.out.println("Sorted Array in Ascending Order ");
    System.out.println(Arrays.toString(data));
  }
}
