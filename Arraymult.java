/**
 * Created by hgupta on 3/10/2017.
 */
public class Arraymult {
    public static int []  calcProductArray(int []arr)
    {
       int n = arr.length;
        int productArr  [] =new int[n];
        for (int  i =0;i<n;i++)
        {
            productArr[i] = 1;

        }
        int product = 1;

        for (int i = 0;i<n;i++)
        {
            productArr[i] *= product;
            product *= arr[i];
        }

        product = 1;
        for(int i =n-1;i>=0;i--)
        {
            productArr[i] *= product;
            product *= arr[i];
        }

        return productArr;

    }

    public static void main(String [] args)
    {
        int [] arr ={2,7,3,4};
        int [] res = calcProductArray(arr);
    }

}
