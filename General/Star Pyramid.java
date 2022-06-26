public class StarHalfPyramid1 {
    public static void main(String args[]) {
        for (int i=1; i<10; i++){
            
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }
}


/*Output:
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * * * 
* * * * * * * * 
* * * * * * * * * 
*/



public class StarHalfPyramid2 {
    public static void main(String args[]) {
        for (int i=1; i<10; i++){
            
            for(int j=1;j<=10-i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }
}


/*
Output:
* * * * * * * * * 
* * * * * * * * 
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
*/



public class StarHalfPyramid3 {
    public static void main(String args[]) {
        for (int i=1; i<10; i++){
            for(int k=2*(10-i); k>0; k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }
}


/*
Output:
                  * 
                * * 
              * * * 
            * * * * 
          * * * * * 
        * * * * * * 
      * * * * * * * 
    * * * * * * * * 
  * * * * * * * * * 

*/


public class StarfullPyramid4 {
    public static void main(String args[]) {
        for (int i=1; i<10; i++){
            for(int k=10-i; k>0; k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }
}



/*
Output:

         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
*/
