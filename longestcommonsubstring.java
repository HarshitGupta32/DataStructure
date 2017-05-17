/**
 * Created by hgupta on 5/1/2017.
 */
public class longestcommonsubstring {
    public static int lcs(String a,String b)
    {
        int m= a.length();
        int n = b.length();
        int [][] res = new int[m][n];
        int result =0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0)
                    res[i][j] = 0;
                else if(a.charAt(i-1) == b.charAt(j-1))
                {
                    res[i][j] = 1+res[i-1][j-1];
                    result = Math.max(result,res[i][j]);
                }
                else
                    res[i][j] = 0;


            }
        }

        return result+1;
    }
    public static void main(String [] args)
    {
        int r = lcs("geeksforgeeksa","geeksa");
    }
}
