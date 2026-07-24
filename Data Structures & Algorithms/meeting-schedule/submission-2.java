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
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        for (int i = 0; i < intervals.size() - 1; i++) {
            for (int j = i; j < intervals.size(); j++) {
                if (i == j) {
                    continue;
                }
                Interval current = intervals.get(i);
                Interval next = intervals.get(j);
                if (next.start < current.end) {
                    return false;
                }
            }
        }
        return true;
    }
}
