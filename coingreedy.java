/**
 * Created by hgupta on 4/2/2017.
 */
public class coingreedy {

    public static void main(String [] args)
    {
        int cents =233;
        int [] coins = {100,50,25,10,5,1};
        int numCoins = 0;
        for(int i=0;i<=coins.length;i++)
        {
            numCoins += cents/coins[i];
            cents%=coins[i];
        }
    }
}
