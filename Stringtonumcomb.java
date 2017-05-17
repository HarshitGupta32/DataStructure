import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgupta on 4/15/2017.
 */
public class Stringtonumcomb {
    private static void getallcombutil(String s, ArrayList<String> temp,List<List<String>>res,int end,int n)
    {
        if(end == n)
        {
            res.add(new ArrayList<String> (temp));
            return;
        }
        for(int i = 1;i<=s.length();i++)
        {
            temp.add(s.substring(0,i));
            getallcombutil(s.substring(i),temp,res,end+s.substring(0,i).length(),n);
            temp.remove(temp.size()-1);
        }
    }

    private static List<List<String>> getallcomb(String s)
    {
        List<List<String>> res = new ArrayList<List<String>>();
        getallcombutil(s,new ArrayList<String>(),res,0,s.length());
        return res;

    }

    public static void main(String [] args)
    {
        List<List<String>> res = getallcomb("123");
    }
}
