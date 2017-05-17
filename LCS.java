/**
 * Created by hgupta on 3/29/2017.
 */
public class LCS {
    public static int lcs(String s1,String s2,int a1,int a2)
    {
        if(a1==0 || a2==0)

            return 0;
        int cost =0;
        if(s1.charAt(a1-1) == s2.charAt(a2-1))
        {
            cost = 1 + lcs(s1,s2,a1-1,a2-1);
        }
        else
        {
            cost = Math.max(lcs(s1,s2,a1-1,a2),lcs(s1,s2,a1,a2-1));
        }
        //arr[a1][a2] = cost;
        return cost;
    }

    public static void main(String [] args)
    {
        int a = lcs("agbtsg","btg",6,3);
    }
}
