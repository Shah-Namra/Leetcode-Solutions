public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if (n == 1) {
            return 0;
        }

        // Sort the intervals based on their start times
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int result = 0;
        int i = 0;
        while (i < n - 1) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                if (intervals[i][1] < intervals[i + 1][1]) {
                    intervals[i + 1] = intervals[i];
                }
                result++;
            }
            i++;
        }

        return result;
    }
}

//
// sort and then compare if they are overlapping    
//https://www.youtube.com/watch?v=nONCGxWoUfM
