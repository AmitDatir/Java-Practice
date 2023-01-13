//Primitive type to Wrapper objects:
public class PrimitiveToObject {
    public static void main(String args[]) {
      int var1 = 56;
      double var2 = 623.51;
      boolean var3 = false;
      
      Integer obj1 = Integer.valueOf(var1);
      Double obj2 = Double.valueOf(var2);
      Boolean obj3 = Boolean.valueOf(var3);
      
      if(obj1 instanceof Integer){
          System.out.println("Integer object created successfully.");
      }
      if(obj2 instanceof Double){
          System.out.println("Double object created successfully.");
      }
      if(obj3 instanceof Boolean){
          System.out.println("Boolean object created successfully.");
      }
    }
}

/*
Output:
Integer object created successfully.
Double object created successfully.
Boolean object created successfully.
*/


//Wrapper objects to Primitive:
public class ObjectToPrimitive {
    public static void main(String args[]) {
      
      Integer obj1 = Integer.valueOf(56);
      Double obj2 = Double.valueOf(623.51);
      Boolean obj3 = Boolean.valueOf(false);
      
      int var1 = obj1.intValue();
      double var2 = obj2.doubleValue();
      boolean var3 = obj3.booleanValue();
      
      System.out.println("The value of int variable = " + var1);
      System.out.println("The value of double variable = " + var2);
      System.out.println("The value of boolean variable = " + var3);
    }
}


/*
Output:
The value of int variable = 56
The value of double variable = 623.51
The value of boolean variable = false
*/
