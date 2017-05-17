/**
 * Created by hgupta on 3/29/2017.
 */
public class CountallPaths {

    public static int getAllPaths(int i,int j,int [][]arr)
    {
        if(i == 0 || j==0)
            return 1;
        if(arr[i][j] == 0)
        {
            int waysLeft = getAllPaths(i-1,j,arr);
            int waysRight = getAllPaths(i,j-1,arr);
            arr[i][j] = waysLeft + waysRight;
        }

        return arr[i][j];

    }

    public static void main(String [] args)
    {
        int [][] arr = new int [4][4];
        int x = getAllPaths(2,2,arr);
    }
}
