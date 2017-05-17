import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by hgupta on 4/29/2017.
 */
public class LRUheap {

    public class node
    {
        int data;
        public node(int val)
        {
            data = val;
        }
    }
    PriorityQueue<node> q;
    HashMap<node,Integer> map;
    int k;
    public LRUheap(int k)
    {
        q = new PriorityQueue<node>(k,new Comparator<node>(){
            @Override
            public int compare(node n1,node n2)
            {
                return map.get(n1)-map.get(n2);
            }

        });
        map = new HashMap<node,Integer>();
        k=k;
    }

    public void add(node data)
    {
        if(q.size() >k)
        {
            //if(map.get(q.peek())<map)
        }
    }
}
