import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgupta on 4/11/2017.
 */
public class combk {
    public static List<List<Integer>> comb(int [] arr, int k)
    {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        combutil(arr,res,new ArrayList<Integer>(),1,k,arr.length);
        return res;

    }

    public static void combutil(int [] arr,List<List<Integer>> res,ArrayList<Integer> temp,int start,int k,int n)
    {
        if(temp.size() == k)
        {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        int rem = k-temp.size();
            for(int i= start;i<arr.length && n-i>= rem;i++)
            {
                temp.add(arr[i]);
                combutil(arr,res,temp,i+1,k,n);
                temp.remove(temp.size()-1);
            }

    }

    public static void main(String [] args)
    {
        comb(new int[]{1,2,3},2);
        int [] arr = new int[0];
        if(arr[0] == arr[-1])
            System.out.println("sada");
    }
}
