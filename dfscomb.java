import java.util.ArrayList;

/**
 * Created by hgupta on 3/17/2017.
 */
public class dfscomb {
    private static ArrayList<ArrayList<String>> res1 = new ArrayList<ArrayList<String>>();

    public static void comb(String [] arr,ArrayList<String> res,int n,int start,int k)
    {
        if(res.size()==k)
        {
            res1.add(new ArrayList(res));
            return;
        }

        for(int i =start;i<n;i++)
        {
            res.add(arr[start]);
            comb(arr,res,n,start+1,k);
            res.remove(res.size()-1);
        }
    }

    public static void main(String [] args)
    {
        String [] arr = {"foo","bar"};
        ArrayList<String> res = new ArrayList<String>();
        comb(arr,res,2,0,2);

    }
}
