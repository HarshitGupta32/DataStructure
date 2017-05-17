/**
 * Created by hgupta on 3/24/2017.
 */
public class lengthofword {
    public static int lengthOfLastWord(String s) {

        if(s.length() == 0)
            return 0;
        int num =0;
        //int num = 0;
        //int lastspace = -1;
        int i =s.length()-1;
        //int lastchar=-1;
        int last= s.length();
        int first = -1;
        boolean set = false;

        while(i>=0)
        {
            if(s.charAt(i) == ' ' && !set)
            {

                i--;
                last = i;


            }
            else if(s.charAt(i) == ' ' && set)
            {
                first = i;
                num++;
                break;

            }
            else
            {
                i--;
                set = true;
            }
        }
        if(num!=0)
        {
            return last-first;
        }
        else
        {
            return last;
        }



    }
    public static void main(String [] args)
    {
        int n = lengthOfLastWord("aaa");
    }
}
