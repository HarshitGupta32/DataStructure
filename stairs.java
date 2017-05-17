class stairs
{
    // A recursive function used by countWays
    static int countWaysUtil(int n, int m)
    {
        if (n <= 1)
            return n;
        int res = 0;
        for (int i = 1; i<=m && i<=n; i++)
            res += countWaysUtil(n-i, m);
        return res;
    }

    static int count2(int n,int m)
    {
        int [] res = new int [n+1];
        res [0] = 1;
        for(int i=1;i<=m;i++)
        {
            for(int j=i;j<res.length;j++)
            {
                res[j]+=res[j-i];
            }
        }
        return res[n];
    }
    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWaysUtil(s+1, m);
    }

    /* Driver program to test above function */
    public static void main (String args[])
    {
        int s = 4,m = 2;
        System.out.println("Number of ways = "+ countWays(s,m));
    }
}