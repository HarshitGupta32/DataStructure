import java.util.ArrayList;

/**
 * Created by hgupta on 3/19/2017.
 */
public class countAndSay {

    public static String  getArray(int n)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        if(n<=0)
            return "";
        if(n == 1)
            return "1";
        else
        {
            arr.add(1);
            temp = sayutil(arr,n-1);
        }

        StringBuilder res = new StringBuilder();
        for(Integer i : temp)
        {
            res.append(Integer.toString(i));
        }
        return String.valueOf(res);


    }

    public static ArrayList<Integer> sayutil(ArrayList<Integer> arr,int n)
    {

        ArrayList<Integer> res = new ArrayList<Integer>();

        while(n>0)
        {
            res = getnextArray(arr);
            arr=res;
            n--;
        }




        return res;


    }

    public static ArrayList<Integer> getnextArray(ArrayList<Integer> arr)
    {
        ArrayList res = new ArrayList<Integer>();

        int temp = arr.get(0);
        int count = 1;

        for(int i =1;i<arr.size();i++)
        {
            if(arr.get(i) == temp)
            {
                count++;
            }
            else
            {
                res.add(count);
                res.add(temp);
                temp = arr.get(i);
                count =1;
            }
        }
        res.add(count);
        res.add(temp);

        return res;
    }

    public static void main(String [] args)
    {
        String res = getArray(9);
    }
}
