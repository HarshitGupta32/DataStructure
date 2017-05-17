/**
 * Created by hgupta on 3/25/2017.
 */
public class genmat {
    public static int[][] generateMatrix(int n) {

        int [][] mat = new int [n][n];

        int colleft = 0;
        int colright = n-1;
        int rowtop = 0;
        int rowbot = n-1;
        int count = 1;

        while(rowtop<=rowbot && colleft<=colright)
        {
            for(int i = colleft;i<=colright;i++)
            {
                mat[rowtop][i] = count;
                count++;
            }
            rowtop++;
            for(int i = rowtop;i<=rowbot;i++)
            {
                mat[i][colright] = count;
                count++;
            }
            colright--;
            if(rowtop<rowbot)
            {
                for(int i = colright; i>=colleft;i--)
                {
                    mat[rowbot][i] = count;
                    count++;
                }
                rowbot--;
            }
            if(colleft<colright)
            {
                for(int i = rowbot;i>=rowtop;i--)
                {
                    mat[i][colleft]= count;
                    count++;
                }
                colleft++;
            }
        }

        return mat;
    }

    public static void main(String [] args)
    {
        int [][] res = generateMatrix(3);
    }
}
