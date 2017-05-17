import java.util.*;

/**
 * Created by hgupta on 4/28/2017.
 */
public class LRU {
    class LRUmap
    {
        LinkedHashMap<Integer,Integer> map ;

        public LRUmap(int capacity) {
            map = new LinkedHashMap<Integer,Integer>(capacity, 1, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> a) {
                return size() > capacity;
                }

        };


        }

    }
}
