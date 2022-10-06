//To sort strings as per dictionary order:
import java.util.Scanner;
public class lexicographicalOrder{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of words to sort: ");
        int x = input.nextInt();
        String words[] = new String[x];
        
        System.out.println("Enter words to sort by Dictionary order: ");
        for (int i=0; i<x; i++){
            words[i] = input.next();
        }
        
        for (int i=0; i<x-1; i++){
            for (int j=i+1; j<x; j++){
                if(words[i].compareTo(words[j]) > 0){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        System.out.println("Given words in lexicographical order: ");
        for(int i=0; i<x; i++){
            System.out.println(words[i]);
        }
    }
}



/*
Output:
Enter number of words to sort: 9
Enter words to sort by Dictionary order: 
javascript
html
css
c
python
c++
perl
java
ruby
Given words in lexicographical order: 
c
c++
css
html
java
javascript
perl
python
ruby
*/
