import java.util.ArrayList;
import java.util.List;

/**
 * Created by hgupta on 4/12/2017.
 */
public class AllPossibleBinaryTrees {
    public  class tree
    {
        tree left ;
        tree right;
        int key;
        public tree(int val)
        {
            key = val;
            left=null;
            right=null;
        }
        public tree(int val,tree left,tree right)
        {
            key = val;
            left=left;
            right=right;
        }
    }

    public  List<tree> getalltrees(int n )
    {
        List<tree> list = new ArrayList();

        if(n == 0)
        {
            list.add(null);
        }
        for(int l =0;l<n;++l)
        {
            int r = n-l-1;
            List<tree> left = getalltrees(l);
            List<tree> right = getalltrees(r);
            for(tree le:left)
            {
                for(tree ri :right)
                { tree curr = new tree(l);
                    curr.left = le;
                    curr.right = ri;
                    list.add(curr);
                }
            }
        }
        return list;
    }

    public static void main(String [] args)
    {
        String s = "abc";
        String ss = s.substring(1);
        String sss = s.substring(1,1);

        AllPossibleBinaryTrees obj = new AllPossibleBinaryTrees();
        List<tree> res = obj.getalltrees(3);
    }
}
