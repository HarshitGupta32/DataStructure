import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by hgupta on 4/13/2017.
 */
public class MaxKsum {

    public static int [] getmaxsum(int [] nums,int k)
    {
        PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(maxheap.size()>=k)
            {
                int v =maxheap.peek();
                if(nums[i]> v)
                {
                    maxheap.poll();
                }
                else
                    continue;
            }
            maxheap.offer(nums[i]);

        }
        int [] res = new int[k];
        Integer val = null;
        int j =0;
        while((val = maxheap.poll())!= null)
        {
            res[j] = val;
            j++;
        }
        return res;

    }

    public static void main(String [] args)
    {
        int a = Integer.parseInt("-2");
        int [] res = getmaxsum(new int [] {1,2,3,4,5,6,7,8,9},4);
    }
}
