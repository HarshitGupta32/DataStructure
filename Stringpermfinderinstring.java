import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hgupta on 3/17/2017.
 */
public class Stringpermfinderinstring {

        public List<Integer> findSubstring(String s, String[] words) {

            int len  = words[0].length();
            ArrayList<Integer> arr = new ArrayList<Integer>();

            HashMap<String,Integer> map = new HashMap<String,Integer>();

            for(String word: words)
            {
                map.put(word,map.containsKey(word)?map.get(word)+1:1);
            }

            for(int i = 0;i<s.length()-len*words.length;i++)
            {
                HashMap<String,Integer> copy = new HashMap<String,Integer>(map);
                for(int j=0;j<words.length;j++)
                {
                    String ss = s.substring(i+j*len,i+j*len+len);
                    if(copy.containsKey(ss))
                    {
                        if(copy.get(ss) == 1)
                            copy.remove(ss);
                        else

                            copy.put(ss,copy.get(ss)-1);
                        if(copy.size()==0)
                            arr.add(i);
                        break;
                    }
                    else
                        break;


                }
            }
            return arr;

        }
    }

