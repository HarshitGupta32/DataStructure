import java.util.HashMap;

/**
 * Created by hgupta on 3/4/2017.
 */
public class triplets {
    public static boolean tripletSum(int x, int[] a) {

        HashMap<Integer,Integer> track = new HashMap<Integer,Integer>();
        for(int i = 0; i<a.length ;i++)
        {
            if(track.containsKey(a[i]))
                track.put(a[i],track.get(a[i]) +1);
            else
                track.put(a[i],1);
        }

        for(int i =0;i<a.length-1;i++)
        {
            for(int j =0;j<a.length-1;j++)
            {
                if(i!=j)
                {
                    int sum = x;
                    sum-=a[i];
                    sum-=+a[j];

                    track.put(a[i],track.get(a[i])-1);
                    track.put(a[j],track.get(a[j])-1);
                    if(track.containsKey(sum) && track.get(sum)>0)
                    {
                        return true;
                    }
                    else{
                        track.put(a[i],track.get(a[i])+1);
                        track.put(a[j],track.get(a[j])+1);
                    }
                }

            }
        }
        return false;

    }
    public static void main(String [] args)
    {
        int [] a = {1, 1, 2, 5, 3};
        boolean res = tripletSum(8,a);
    }

}
