import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by hgupta on 4/15/2017.
 */
public class validparenthesis {

    public static boolean isValid(String s)
    {
        char [] paren = s.toCharArray();
        Stack<Character> inbound = new Stack<>();
        for(char c: paren)
        {
            if(c=='(' || c=='[' || c=='{')
                inbound.push(c);
            else
            {if(inbound.isEmpty() && (c==')' || c==']' || c=='}') )
                return false;

                else if(inbound.peek() == '(' && c == ')')
                    inbound.pop();
                else if(inbound.peek() == '{' && c == '}')
                    inbound.pop();
                else if(inbound.peek() == '[' && c == ']')
                    inbound.pop();

            }
        }
        if(inbound.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        String s = "abcde";
        String ss = s.substring(1);
        boolean a = isValid("({})[]}");
    }
}
