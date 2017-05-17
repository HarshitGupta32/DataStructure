import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hgupta on 3/23/2017.
 */
public class mergeintervals {
    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {

        if (intervals.size() == 1 || intervals.size() == 0)
            return intervals;

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }


        });

        List<Interval> result = new ArrayList<Interval>();
        int start1 = intervals.get(0).start;
        int end1 = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {
            if (end1 < intervals.get(i).end && end1 >= intervals.get(i).start) {
                end1 = intervals.get(i).end;
            } else {
                result.add(new Interval(start1, end1));
                start1 = intervals.get(i).start;
                end1 = intervals.get(i).end;
            }
        }

        result.add(new Interval(start1, end1));

        return result;
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals.size() == 1 || intervals.size() == 0)
            return intervals;

        /*Collections.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval i1,Interval i2)
            {
                return i1.start - i2.start;
            }


        });*/

        //intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));

        //List<Interval> result = new ArrayList<Interval>();
        int start1 = newInterval.start;
        int end1 =newInterval.end;
        boolean set = false;

        for(int i = 0; i< intervals.size();i++)
        {
            if( (end1 >= intervals.get(i).start && end1 <= intervals.get(i).end  || (start1>= intervals.get(i).start && start1<= intervals.get(i).end) ))
            {
                end1 = Math.max(intervals.get(i).end,end1);
                start1 = Math.min(intervals.get(i).start,start1);
                intervals.set(i,new Interval(start1,end1));
                set = true;

            }


        }
        if(!set)
        {
            intervals.add(new Interval(start1,end1));
        }

        //result.add(new Interval(start1,end1));

        return intervals;
    }
    public static void main(String [] args)
    {
        Interval a = new Interval(9,14);
        Interval b = new Interval(5,7);
        Interval c = new Interval(1,4);
        List<Interval> list = new ArrayList<Interval>();
        list.add(a);
        list.add(b);
        list.add(c);
        List<Interval> merge = merge(list);
        List<Interval> insert = merge(list);

    }
}
