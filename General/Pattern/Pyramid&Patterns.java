//Half star pyramid
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



//inverted half star pyramid-1
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



//inverted half star pyramid-2
public class StarHalfPyramid3 {
    public static void main(String args[]) {
        for (int i=10; i>=1; i--){
            
            for(int j=1;j<=i;j++){
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


//Half star pyramid-2
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




//Full star pyramid:
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



//Half number pyramid:
public class NumberHalfPyramid {
    public static void main(String args[]) {
        for (int i=1; i<10; i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}

/*
Output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
*/




//Inverted half number pyramid-1:
public class NumberHalfPyramid3 {
    public static void main(String args[]) {
        for (int i=9; i>=1; i--){
            
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
}


//Inverted half number pyramid-2:
public class NumberHalfPyramid4 {
    public static void main(String args[]) {
        for (int i=1; i<=10; i++){
            
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





//0-1 pyramid:
public class NewTest {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				if(!(j%2==0)) {
				System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}




/*
Output:
1
10
101
1010
10101
101010
1010101
10101010
101010101
1010101010
*/
