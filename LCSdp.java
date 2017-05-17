import java.util.Scanner;

/**
 * Created by hgupta on 3/29/2017.
 */
public class LCSdp {
    public static int lcs(String s1,String s2)
    {
        int [][] arr = new int[s1.length()+1][s2.length()+1];

        for(int i=0;i<=s1.length();i++)
        {
            for(int j = 0;j<=s2.length();j++)
            {
                if(i==0 || j==0)
                    arr[i][j]=0;

                else if(s1.charAt(i-1) == s1.charAt(j-1))
                    arr[i][j] = 1+arr[i-1][j-1];
                else
                {
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }

        }
        return arr[s1.length()][s2.length()];
    }

    public static int uniqueHelper(int m,int n)
    {
        if(m ==0 || n==0)
            return 1;

        return uniqueHelper(m-1,n) +  uniqueHelper(m,n-1);
    }

    public static void main(String [] args)
    {

        int a = uniqueHelper(2,2);
        Scanner s = new Scanner(System.in);
        int paths = lcs("abctgf","bcgf");
        String ss = "a";
        String sss = "a";
        //String a = ss^sss;
        ss.substring(0);

    }
}
