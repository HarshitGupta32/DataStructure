import java.util.Arrays;
import java.util.List;

/**
 * Created by hgupta on 4/2/2017.
 */
public class addBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        String [] aa = {"aaa"};
        Arrays.asList(aa);

        //return new List<String>("aaa");
        return sb.reverse().toString();
    }

    public static void main(String [] args)
    {
        char a = 'a';
        a+=1;
        String s ="";
        char[] arr = s.toCharArray();
        int q =128;
        int aaaa = (int)Math.sqrt(q);
        //String a = addBinary("11","111");
    }
}
