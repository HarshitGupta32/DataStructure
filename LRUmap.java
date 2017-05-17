import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hgupta on 4/28/2017.
 */
public class LRUmap {

    LinkedHashMap<Integer,Integer> map ;
    public LRUmap(int capacity)
    {
        map = new LinkedHashMap<Integer,Integer>(capacity,1,true)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> a)
            {
                return size() > capacity;
            }
        };
    }

    public static void main(String [] args)
    {
        LRUmap m = new LRUmap(5);
        m.map.put(1,2);
        m.map.put(0,2);
        m.map.put(8,2);
        m.map.put(2,2);
        m.map.put(7,9);
        m.map.put(5,2);
        m.map.put(3,4);
        m.map.get(100);
        m.map.get(7);

    }
}


