import java.util.ArrayList;

/**
 * Created by hgupta on 3/26/2017.
 */
public class NFL
{
    private static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public static void get(ArrayList<Integer> arr,int score)
    {
        if(score == 0)
            res.add(arr);

        if(score-2>=0)
            get(arr,score-2);
        arr.remove(arr.size()-1);
        if(score-3>=0)
            get(arr,score-3);
        arr.remove(arr.size()-1);
        if(score-7>=0)
            get(arr,score-7);
    }

    public static void main(String [] args)
    {
        int [] ar = new int[5];
        get(new ArrayList<Integer>(),22);
    }
}
