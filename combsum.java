import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgupta on 4/30/2017.
 */
public class combsum {

    public static List<List<Integer>> getsum(int [] arr,int target)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        getsumutil(arr,new ArrayList<Integer>(),result,target,0,0);
        return result;
    }
    public static void getsumutil(int [] arr,ArrayList<Integer> temp,List<List<Integer>> res,int target,int curr,int start)
    {
        if(curr>target)
            return;
        if(curr == target)
            res.add(new ArrayList<Integer>(temp));
        else
        {
            for(int i=start;i<arr.length;i++)
            {
                //if(i>0 && arr[])
                temp.add(arr[i]);
                getsumutil(arr,temp,res,target,curr+arr[i],start+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String [] args)
    {
        List<List<Integer>> res = getsum(new int [] {2,3,6,7},7);
    }

}
