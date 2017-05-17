/**
 * Created by hgupta on 4/20/2017.
 */
public class baseconversion {
    public static String basetobase(String num,String b1,String b2)
    {
        int n = Integer.parseInt(num);
        int base = Integer.parseInt(b1);
        int temp = 0;
        int c =0;
        while(n>0)
        {
            //temp*=10;
            temp+=(n%10)*Math.pow(base,c);
            n=n/10;
            c++;
        }
        //temp = reverse(temp);
        String res = "";
        base = Integer.parseInt(b2);
        while(temp!=0)
        {
            res= String.valueOf(temp%base)+res;
            temp=temp/base;
        }


        return res;
    }

    public static int reverse(int num)
    {
        int res = 0;

        while(num>0)
        {
            res *=10;
            res += num%10;
            num=num/10;
        }
        return res;
    }

    public static void main(String [] args)
    {
        String r = basetobase("615","7","13");
    }
}
