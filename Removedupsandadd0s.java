import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hgupta on 4/23/2017.
 */
public class Removedupsandadd0s {

    public static int deletedups(List<Integer> a)
    {
        int writeidx = 1;
        for(int i=1;i<a.size();i++)
        {
            if(!a.get(writeidx-1).equals(a.get(i)))
                a.set(writeidx++,a.get(i));
        }
        return writeidx;
    }

    public static void main(String [] args)
    {char aa = '1'+1;
        List<Integer> a = new ArrayList<>();
    a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);a.add(3);
        a.add(3);

        deletedups(a);
    }

}
