import java.util.Arrays;

/**
 * Created by hgupta on 4/3/2017.
 */
public class atlassian2 {

    static int[] chooseFleets(int[] wheels) {

        if(wheels.length == 0)
            return null;
        int [] vehicals = new int [] {2,4};
        int [] wheelsCopy = new int[wheels.length];
        wheelsCopy = wheels.clone();
        Arrays.sort(wheelsCopy);
        int n = wheelsCopy[wheelsCopy.length-1];
        int [] result = new int[n+1];
        result[0] = 1;

        for(int i=0;i<vehicals.length;i++)
        {
            for(int j=vehicals[i];j<result.length;j++)
            {
                result[j] += result[j-vehicals[i]];
            }
        }

        int [] retArray = new int[wheels.length];

        for(int i =0;i<wheels.length;i++)
        {
            retArray[i] = result[wheels[i]];
        }

        return retArray;



    }

    public static void main(String [] args)
    {
        int [] arr = chooseFleets(new int[]{6,3,2});
    }
}
