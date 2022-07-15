public class numbersSwap1 {
    public static void main(String args[]) {
        float first = 1.76f, second = 3.14f;
        float temp = 0.0f;
        System.out.println("2 numbers before swapping are: " + first + " & " + second); 
        temp = first;
        first = second;
        second = temp;
        System.out.println("Numbers after swapping are: " + first + " & " + second); 
    }
}



/*
Output:
2 numbers before swapping are: 1.76 & 3.14
Numbers after swapping are: 3.14 & 1.76
*/



public class numbersSwap2 {
    public static void main(String args[]) {
        float first = 1.76f, second = 3.14f;
        //float temp;
        System.out.println("2 numbers before swapping are: " + first + " & " + second); 
        //temp = first;
        //first = second;
        //second = temp;
        first = first - second;
        second = first + second;
        first = second - first;
        System.out.println("Numbers after swapping are: " + first + " & " + second); 
    }
}


/*
Output:
2 numbers before swapping are: 1.76 & 3.14
Numbers after swapping are: 3.14 & 1.76
*/
