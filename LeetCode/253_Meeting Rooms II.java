/*
253. Meeting Rooms II: https://leetcode.com/problems/meeting-rooms-ii/ |https://neetcode.io/problems/meeting-schedule-ii/
Given an array of meeting time interval objects consisting of start and end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i), find the minimum number of rooms required to schedule all meetings without any conflicts.

Note: (0,8),(8,10) is NOT considered a conflict at 8.
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
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        if (n == 0) {
            return 0;
        }

        int[] starts = new int[n];
        int[] ends = new int[n];

        for (int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int rooms = 0;
        int maxRooms = 0;
        int endIterator = 0;

        for (int i = 0; i < n; i++) {
            // If the current meeting starts before the earliest ending meeting
            if (starts[i] < ends[endIterator]) {
                rooms++;
            } else {
                // We can reuse a room, so we don't increment, just point to the next end time
                endIterator++;
            }
            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }
}
