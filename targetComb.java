import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by hgupta on 3/19/2017.
 */
public class targetComb {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> list1  = new ArrayList<Integer>();
        Arrays.sort(candidates);

        combutil(candidates,target,list,list1,0);

        return list;

    }

    public static void combutil(int[] candidates, int target,List<List<Integer>> list, ArrayList<Integer> current,int start)
    {
        if(target == 0)
            list.add(new ArrayList(current));

        else
        {
            for(int i =start;i<candidates.length && candidates[i]<=target;i++)
            {
                current.add(candidates[i]);
                combutil(candidates,target-candidates[i],list,current,i+1);
                current.remove(current.size()-1);
            }
        }



    }

    public static void main(String []  args)
    {
        int i = 8;
        int [] arr = {10,1,2,7,6,1,5};
        List<List<Integer>> sum = combinationSum(arr,i);
        HashSet<Integer> a = new HashSet<Integer>();
        a.toArray();
    }
}
