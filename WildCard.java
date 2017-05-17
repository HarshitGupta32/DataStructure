/**
 * Created by hgupta on 4/15/2017.
 */
public class WildCard {
    public static boolean isMatch(String s, String p) {

        int st =0;
        int pa =0;
        boolean prevstar = false;
        int star = -1;

        while(st<s.length() && pa<p.length())
        {
            if(p.charAt(pa) == '?' || p.charAt(pa) == s.charAt(st))
            {
                pa++;
                st++;
                prevstar = false;
            }
            else if(p.charAt(pa) == '*')
            {
                pa++;
                prevstar = true;

            }

            else
            {
                if (prevstar)
                {
                    st++;
                }
                else
                    return false;
            }

        }

        return true;

    }
    static boolean  comparison(String str, String pattern) {
        int s = 0, p = 0, match = 0, starIdx = -1;
        while (s < str.length()){
            // advancing both pointers
            if (p < pattern.length()  && (pattern.charAt(p) == '?' || str.charAt(s) == pattern.charAt(p))){
                s++;
                p++;
            }
            // * found, only advancing pattern pointer
            else if (p < pattern.length() && pattern.charAt(p) == '*'){
                starIdx = p;
                match = s;
                p++;
            }
            // last pattern pointer was *, advancing string pointer
            else if (starIdx != -1){
                //p = starIdx + 1;
                match++;
                s = match;
            }
            //current pattern pointer is not star, last patter pointer was not *
            //characters do not match
            else return false;
        }

        //check for remaining characters in pattern
        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;

        return p == pattern.length();
    }

    public static void main(String [] args)
    {boolean f = comparison("aaadef","a*d*f");
    }
}
