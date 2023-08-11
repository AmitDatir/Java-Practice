/*
217. Contains Duplicate : https://leetcode.com/problems/contains-duplicate/description/
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/


//Using Hashset:
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int idx = 0; idx < nums.length; idx ++){
            if (hset.contains(nums[idx])){
                return true;
            }
            hset.add(nums[idx]);
        }
        return false;
    }
}


//Simple loops:
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
