/*
202. Happy Number : https://leetcode.com/problems/happy-number/description/
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.
*/


//HashSet:
class Solution {
  public boolean isHappy(int n) {
      Set<Integer> inLoop = new HashSet<Integer>();
      int squareSum,remain;
	    while (inLoop.add(n)) {
		    squareSum = 0;
		    while (n > 0) {
		      remain = n%10;
			    squareSum += remain*remain;
			    n /= 10;
		  }
		  if (squareSum == 1)
			  return true;
		  else
			  n = squareSum;
	  }
	  return false;
  }
}



//O(1) space:
public class Solution {
    public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(x>1){
            x = cal(x) ;
            if(x==1) return true ;
            y = cal(cal(y));
            if(y==1) return true ;

            if(x==y) return false;
        }
        return true ;
    }
    public int cal(int n){
        int x = n;
        int s = 0;
        while(x>0){
            s = s+(x%10)*(x%10);
            x = x/10;
        }
        return s ;
    }
}
