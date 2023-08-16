/*
263. Ugly Number : https://leetcode.com/problems/ugly-number/description/
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.
*/



//1:
class Solution {
    public boolean isUgly(int n) {
        for (int i=2; i<6 && n>0; i++){
            while (n % i == 0){
                n /= i;
            }
        }
        return n == 1;
    }
}



//2:
class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) {return false;}
        if (num == 1) {return true;}
        if (num % 2 == 0) {
        return isUgly(num/2);
        }
        if (num % 3 == 0) {
        return isUgly(num/3);
        }
        if (num % 5 == 0) {
        return isUgly(num/5);
        }
        return false;
    }
}
