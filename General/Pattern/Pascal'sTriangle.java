public class PascalsTriangle {
    public static void main(String args[]) {
        int rows=7, coeff=1;
        
        for(int i=0; i<rows; i++){
            for(int j=1; j< rows-i; j++){
                System.out.print(" ");
            }
            
            for(int j=0; j<=i; j++){
                if(j==0 || i==0){
                    coeff=1;
                } else{
                    coeff = coeff * (i-j+1)/j;
                }
                System.out.printf("%4d",coeff);
            }
            
            System.out.println();
        }
    }
}


/*
Output:
         1
        1   1
       1   2   1
      1   3   3   1
     1   4   6   4   1
    1   5  10  10   5   1
   1   6  15  20  15   6   1
*/
