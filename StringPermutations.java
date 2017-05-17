import java.util.ArrayList;

/**
 * Created by hgupta on 4/11/2017.
 */
public class StringPermutations {
    public static ArrayList<String> comb(String s)
    {
        char [] arr = s.toCharArray();
        ArrayList<String> res = new ArrayList<String>();

        combUtil(arr,new StringBuilder(),res,0);
        return res;
    }

    public static void combUtil(char [] arr,StringBuilder sb,ArrayList<String> res,int start)
    {
        if(sb.length() == arr.length)
        {
            String s = sb.toString();
            res.add(s);
        }

        for(int i =0;i<arr.length;i++)
        {
            //if(sb.)
         sb.append(arr[i]);
        }
    }
}
