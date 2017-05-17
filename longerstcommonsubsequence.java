/**
 * Created by hgupta on 5/1/2017.
 */
public class longerstcommonsubsequence {

    public static int lcs(String s1,String s2)
    {
        int m = s1.length();
        int n= s2.length();
        int [][] res = new int[m+1][n+1];

        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                    res[i][j] = 0;
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                    res[i][j] = 1+res[i-1][j-1];
                else
                    res[i][j] = Math.max(res[i-1][j],res[i][j-1]);

            }
        }
        return res[m][n];
    }

    public static void main(String [] args)
    {
        int r= lcs("abcdhij","bhj");
    }
}
