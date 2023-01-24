class PrintObj1{
    
}
public class Main {
    public static void main(String args[]) {
        PrintObj1 test = new PrintObj1();
        System.out.println("Object created: " + test);         // PrintObj1 : name of class ; @ : join strings ; 16f65612 : Hashcode value of object
    }                                                          // toString() Object method is called while printing
}


//Output: Object created: PrintObj1@16f65612



//Customized object:
class PrintObj2{
    @Override
    public String toString(){                       //to Override existing toString() method
        return "Object creation success";
    }
}
public class Main {
    public static void main(String args[]) {
        PrintObj2 test = new PrintObj2();
        System.out.println("Object created?: " + test);         // toString() method overridden
    }                                                          
}



//Output:   Object created?: Object creation success
