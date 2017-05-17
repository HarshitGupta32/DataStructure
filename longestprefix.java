import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by hgupta on 4/25/2017.
 */
public class longestprefix {
    public static String longestCommonPrefix(String[] strs) {

        int  i = 1;
        if(strs.length == 0)return "";
        String prefix = strs[0];

        while(i<strs.length)
        {
            if(strs[i].indexOf(prefix)!=0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
            }
            i++;
        }
        return prefix;
    }
    public static void main(String [] args)
    {
        String [] arr = new String []{"ba","aaaa","aaaaaa"};
        Arrays.sort(arr);
        String s = longestCommonPrefix(arr);
    }

}
