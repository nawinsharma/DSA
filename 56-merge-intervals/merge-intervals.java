import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output_array = new ArrayList<>();
        
        int[] current_interval = intervals[0];
        output_array.add(current_interval);
        
        for (int[] interval : intervals) {
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if (next_begin <= current_end) { 
                // Merge intervals
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                // Move to next interval
                current_interval = interval;
                output_array.add(current_interval);
            }
        }

        return output_array.toArray(new int[output_array.size()][]);
    }
}
