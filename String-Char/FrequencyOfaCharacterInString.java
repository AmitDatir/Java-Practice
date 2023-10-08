import java.util.Scanner;

public class frequecyChar{
    public static void main(String args[]){
        int frequency=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string to check: ");
        String str = input.nextLine();
        
        System.out.print("Enter a character to find frequency: ");
        char ch = input.next().charAt(0);
        
        for(int i=0; i<str.length(); i++){
            if(ch == str.charAt(i)){
                frequency++;
            }
        }
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}


/*
Output:
1.
Enter a string to check: Amit Chandrakant Datir
Enter a character to find frequency: an
Frequency of a = 4

2.
Enter a string to check: amit chandrakant datir
Enter a character to find frequency: a
Frequency of a = 5

3.
Enter a string to check: Amit Chandrakant Datir
Enter a character to find frequency: a
Frequency of a = 4
*/
