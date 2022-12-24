public class ChartToInt1 {
  public static void main(String[] args) {
    char a = '5';
    char b = 'c';

    int num1 = a;                 // ASCII value of characters is assigned
    int num2 = b;

    System.out.println(num1);    
    System.out.println(num2);    
  }
}



/*
Output:
53
99
*/


//using getNumericValue() method:
public class ChartToInt2 {
  public static void main(String[] args) {
    char a = '5';
    char b = 'c';

    int num1 = Character.getNumericValue(a);         //returns numeric value
    int num2 = Character.getNumericValue(b);

    System.out.println(num1);    
    System.out.println(num2);    
  }
}


/*
Output:
5
12
*/


//using parseInt() method:
public class ChartToInt3 {
  public static void main(String[] args) {
    char a = '5';
    char b = '7';

    int num1 = Integer.parseInt(String.valueOf(a));         //String.valueOf() : char variable into string
    int num2 = Integer.parseInt(String.valueOf(b));         //Integer.parseInt(): string into integer

    System.out.println(num1);    
    System.out.println(num2);    
  }
}


/*
Output:
5
7
*/



//by substracting '0':
public class ChartToInt4 {
  public static void main(String[] args) {
    char a = '5';
    char b = '7';

    int num1 = a - '0';
    int num2 = b - '0';

    System.out.println(num1);    
    System.out.println(num2);    
  }
}
