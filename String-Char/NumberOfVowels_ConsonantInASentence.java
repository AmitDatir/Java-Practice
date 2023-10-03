import java.util.Scanner;

public class VowelConsonantCount{
    public static void main(String args[]){
        int vowel=0, consonant=0, numbers=0, spaces=0, others=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String str = input.nextLine();
        str = str.toLowerCase();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowel++;
            } else if( ch>='a' && ch<='z'){
                consonant++;
            } else if(ch>='0' && ch<='9'){
                numbers++;
            } else if (ch == ' '){
                spaces++;
            } else{
                others++;
            }
        }
        
        System.out.println("Details of given string text: ");
        System.out.printf(" Vowels: %d \n Consonant: %d \n Numbers: %d \n Spaces: %d \n Others: %d", vowel, consonant, numbers, spaces, others);
    }
}


/*
Enter a string to check: java is awesome!!! 123 456 789 0
Details of given string text: 
 Vowels: 7 
 Consonant: 6 
 Numbers: 10 
 Spaces: 6 
 Others: 3
*/
