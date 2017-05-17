import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hgupta on 5/1/2017.
 */
public class wordbreaker {

    public static Set<String> getAllWords(String s, HashSet<String> map)
    {
        Set<String> list = new HashSet<String>();
        getAllWordsutil(s,map,list,0);
        return list;
    }

    public static void getAllWordsutil(String s,HashSet<String> map,Set<String> list,int start)
    {
        if(start == s.length())
            return;

        for(int i =start+1;i<=s.length();i++)
        {
            String prefix = s.substring(start,i);
            if(map.contains(prefix)) {
                list.add(prefix);
                getAllWordsutil(s, map, list, i );
            }
        }
    }

    public static void main(String [] args)
    {
        HashSet<String> map = new HashSet<String>();
        map.add("bed");
        map.add("bath");
        map.add("and");
        map.add("beyond");
        map.add("hand");
        map.add("bat");
        Set<String> res = getAllWords("bedbathandbeyond",map);
    }
}
