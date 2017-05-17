import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by hgupta on 2/18/2017.
 */
public class Stk {
    public static String longestCommonPrefix(String[] strs) {

        int  i = 1;
        String prefix = strs[0];

        while(i<strs.length)
        {
            StringBuilder sb  = new StringBuilder();

            for(int j = 0; j<prefix.length();j++)
            {
                if(prefix.charAt(j) == strs[i].charAt(j))
                {
                    sb.append(prefix.charAt(j));
                }
                prefix = sb.toString();
            }
        }
        return prefix;
    }
    static void main(String [] args)
    {

        String [] strs = {"abba","abc","abdd"};
        String prefix = longestCommonPrefix(strs);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);


        
    }
}
