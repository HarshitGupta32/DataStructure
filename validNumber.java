/**
 * Created by hgupta on 4/2/2017.
 */
public class validNumber {
    public static boolean isNumber(String s) {

        if(s.length() == 0)
            return false;
        int i = 0;
        int minus = 0;
        int e =0;
        int dot =0;
        while(i<s.length())
        {
            char a = s.charAt(i);
            if(a == '-' && minus<1 && i == 0)
                minus++;

            else if(a == 'e' && e<1 && i!=s.length()-1 )
                e++;

            else if(a == '.' && dot<1 && i!=s.length()-1 )
                dot++;

            else if(a>='0' && a<='9')
            {
                i++;
                continue;

            }


            else
                return false;
            i++;

        }

        return true;
    }

    public static void main(String [] args)
    {
        boolean f = isNumber("2.33");
    }
}
