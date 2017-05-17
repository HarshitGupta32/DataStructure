/**
 * Created by hgupta on 3/26/2017.
 */
public class CoinScore {
    public static int noOfWays(int [] arr,int target)
    {
        int [] result = new int [target+1];
        result[0] = 1;
        for(int i= 0;i<arr.length;i++)
        {
            for(int j = arr[i];j<=target;j++)
            {
                result[j] += result[j-arr[0]];
            }
        }

        return result[result.length-1];
    }

    public static void main(String [] args)
    {
        int x = noOfWays(new int []{1,5,10,25},100);
    }
}
