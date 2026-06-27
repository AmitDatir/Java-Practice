/*
219. Contains Duplicate II : https://leetcode.com/problems/contains-duplicate-ii/
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/


//sliding window:
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // If the sliding window size exceeds k, remove the oldest element
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            // If the element is already in the window, we found our duplicate
            if (!window.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}



//using hashmap:
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Check if the number was seen before
            if (map.containsKey(nums[i])) {
                // Check if the distance is less than or equal to k
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the map with the latest index of this number
            map.put(nums[i], i);
        }
        return false;
    }
}
