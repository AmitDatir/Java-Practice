/*
252.Meeting Rooms: https://leetcode.com/problems/meeting-rooms/ | https://neetcode.io/problems/meeting-schedule/
Given an array of meeting time interval objects consisting of start and end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i), determine if a person could add all meetings to their schedule without any conflicts. The intervals may be provided in any order.

Note: (0,8),(8,10) is not considered a conflict at 8
*/




/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Sort intervals based on start time
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        
        // Check for overlaps
        for (int i = 1; i < intervals.length; i++) {
            if (intervals.get(i).start < intervals.get(i - 1).end) {
                return false; // Overlap detected
            }
        }
        return true;
    }
}
