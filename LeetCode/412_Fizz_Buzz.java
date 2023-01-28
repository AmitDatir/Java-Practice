//Fizz Buzz Simple:
import java.util.Scanner;
public class FizzBuzzSimple {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int n = input.nextInt();
        
        for( int i=1; i <= n; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else{
                System.out.println(i);
            }
        }
    }
}


/*
Output:
Enter any integer: 30
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FizzBuzz
*/



//LeetCode Simple:
/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> s = new ArrayList<String>();
        for( int i = 1; i <= n; i++){
            if(i % 15 == 0){
                s.add("FizzBuzz");
            } else if(i % 5 == 0){
                s.add("Buzz");
            } else if(i % 3 == 0){
                s.add("Fizz");
            } else{
                s.add(String.valueOf(i));
            }
        }
        return s;
    }
}
