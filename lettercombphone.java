import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hgupta on 3/7/2017.
 */
public class lettercombphone {
    public List<String> letterCombinations(String digits) {

        if(digits.length()==0)
            return new ArrayList<String>();

        ArrayList<Character> temp = new ArrayList<Character>();
        ArrayList<String> result = new ArrayList<String>();
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");

        letterCombutil(digits,map,temp,result);
        return result;

    }
    public void letterCombutil(String digits,HashMap<String,String> map,ArrayList<Character> temp,ArrayList<String> result)
    {
        if(temp.size()== digits.length())
        {char [] arr = new char[temp.size()];
            for(int i =0;i<temp.size();i++)
            {
                arr[i] = temp.get(i);
            }
            result.add(String.valueOf(arr));
            return;
        }

        String dg = digits.substring(0,1);
        String list = map.get(dg);
        for(int i =0;i<list.length();i++)
        {
            temp.add(list.charAt(i));
            letterCombutil(digits.substring(1),map,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}
