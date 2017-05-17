import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgupta on 4/13/2017.
 */
public class inttostringencoding {

    public static List<List<Integer>> getAllComb(int [] nums)
    {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        getallutil(nums,new ArrayList<Integer>(),res,0);
        return res;
    }

    public static void getallutil(int [] nums, ArrayList<Integer> temp , List<List<Integer>> res, int start)
    {
        if(start == nums.length)
        {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        int first = nums[start];
        temp.add(first);
        getallutil(nums,temp,res,start+1);
        temp.remove(temp.size()-1);
        if(start != nums.length -1)
        {
            int second = nums[start]*10 + nums[start+1];
            if(second<=26)
            {
                temp.add(second);
                getallutil(nums,temp,res,start+2);
                temp.remove(temp.size()-1);
            }
        }

    }

    public static void main(String [] args)
    {
        List<List<Integer>> res = getAllComb(new int []{1,2,3,4});
    }
}
