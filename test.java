import java.util.ArrayList;
import java.util.BitSet;

/**
 * Created by hgupta on 3/2/2017.
 */
public class test {
    public static void main(String [] args) {
        String s = "Iamgod";
        String ss = ";";
        int ii = s.indexOf(ss);
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 4;i>0;i--)
        {StringBuilder sb = new StringBuilder();
            int j =i;
            int x =i;
            while(j>0)
            {
                sb.append(" ");
                j--;
            }
            for(int k = 4-i;k>0;k--)
                sb.append("#");
            arr.add(sb.toString());

        }
        for(String ssss: arr)
        {
            System.out.println(s);
        }




        }
    }


