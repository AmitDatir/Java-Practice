//Using getter & setter method:
import java.util.Scanner;

class Pvt1 {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you name and age: ");
        String n = input.next();
        int a = input.nextInt();

        Pvt1 test = new Pvt1();
        test.setAge(a);
        test.setName(n);

        System.out.println("Value after accessing private variables: ");
        System.out.println("Name: " + test.getName());
        System.out.println("Age: " + test.getAge());
    }
}


/*
Output:
Enter you name and age: 
Amit
25
Value after accessing private variables: 
Name: Amit
Age: 25
*/
