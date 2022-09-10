public class FloydsTriangle {
    public static void main(String args[]) {
        int rows=7, coeff=1;
        
        for(int i=1; i<=rows; i++){
            for(int j=1; j<= i; j++){
                System.out.print(coeff + " ");
                coeff++;
            }
            
            System.out.println();
        }    
    }
}



/*
Output:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
*/
