import java.util.*;

public class MergedIntervals{
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> mergedIntervals = new LinkedList<>();
        for (int[] interval : intervals) {
            if(mergedIntervals.isEmpty() || mergedIntervals.getLast()[1] < interval[0])
                mergedIntervals.add(interval);
            else
                mergedIntervals.getLast()[1] = Math.max(mergedIntervals.getLast()[1], interval[1]);
        }
        mergedIntervals.forEach((interval) -> {
            System.out.println(interval[0] + " " + interval[1]);
        });
    }
}