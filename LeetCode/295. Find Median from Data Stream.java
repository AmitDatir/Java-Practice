/*
295. Find Median from Data Stream: https://leetcode.com/problems/find-median-from-data-stream/
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.

For example, for arr = [2,3,4], the median is 3.
For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
Implement the MedianFinder class:

MedianFinder() initializes the MedianFinder object.
void addNum(int num) adds the integer num from the data stream to the data structure.
double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
*/



import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    // Stores the smaller half of the numbers (highest value at the top)
    private PriorityQueue<Integer> maxHeap;
    // Stores the larger half of the numbers (lowest value at the top)
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        // Step 1: Add to maxHeap first to maintain relative order
        maxHeap.offer(num);
        
        // Step 2: Balance the value distribution by moving the largest of maxHeap to minHeap
        minHeap.offer(maxHeap.poll());
        
        // Step 3: Balance the sizes so that maxHeap can only have at most 1 more element than minHeap
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        // If the total count is odd, the median is the top element of the maxHeap
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        // If the total count is even, return the average of both heap roots
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}


/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
