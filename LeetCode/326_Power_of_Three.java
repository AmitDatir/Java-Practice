/*
326. Power of Three : https://leetcode.com/problems/power-of-three/description/
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.
*/



//1:
public class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int  
        return ( n>0 &&  1162261467%n==0);
    }
}



//2:
public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n!=1){
            int r=n%3; // r: remainder
            n=n/3;
            if(r!=0) return false;
        }
        return true;
    }
}



//3:
public class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>=3){
            if(n%3!=0) return false;
            n/=3;
        }
        return n==1;
    }
}



//4:
public class Solution {
    public boolean isPowerOfThree(int n) {
       return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
