/**
 * Created by hgupta on 4/3/2017.
 */
public class atlassian {


    static String rollTheString(String s, int[] roll) {

        if(s.length() == 0)
            return s;
        char[] arr = s.toCharArray();
        for(int i=0;i<roll.length;i++)
        {
            for(int j =0;j<roll[i];j++)
            {
                arr[j] += 1;
            }
        }

        return String.valueOf(arr);

    }

    public static void main(String [] args)
    {
        String ss = rollTheString("abc",new int []{1,2,3});

    }
}





