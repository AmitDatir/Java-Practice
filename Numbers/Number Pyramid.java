public class NumberPyramid {
    public static void main(String args[]) {
        for (int i=1; i<10; i++){
            
            for(int j=1;j<=10-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
}


/*
Output:
1 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
