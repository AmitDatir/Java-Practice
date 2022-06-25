public class sortArray2 {
    public static void main(String args[]) {
      int[] aRR1 = new int[]{15,12,13,15,16,84,56,-84,20,10};
      System.out.println("Ascending order of elements in the array:");
      for(int i=0; i<aRR1.length; i++){
          for(int j=i+1; j<aRR1.length; j++){
              int temp=0;
              if(aRR1[i]>aRR1[j]){
                  temp=aRR1[i];
                  aRR1[i]=aRR1[j];
                  aRR1[j]=temp;
                  
              }
          }
          System.out.println( aRR1[i] );
}
}
}


//Output:
Ascending order of elements in the array:
-84
10
12
13
15
15
16
20
56
84



//using advanced for loop to print ascending order of array elements:
public class sortArray3 {
    public static void main(String[] args) {
        int [] aRR1 = new int[]{15,12,13,15,16,84,56,-84,20,10};
        System.out.println("Ascending order of elements in the array:");
        for(int i=0; i<aRR1.length;i++){
            for(int j=i+1; j<aRR1.length ; j++){
                int temp = 0;
                if(aRR1[i]>aRR1[j]){
                    temp = aRR1[i];
                    aRR1[i] = aRR1[j];
                    aRR1[j] = temp;
                }
            }
        }
        for(int a:aRR1)
        System.out.print(a+" ");
    }
}



//Output:
Ascending order of elements in the array:
-84 10 12 13 15 15 16 20 56 84 
