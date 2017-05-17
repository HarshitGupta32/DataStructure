/**
 * Created by hgupta on 3/23/2017.
 */
public class jump {
    enum Index {
        GOOD, BAD, UNKNOWN
    }
    public static boolean canJump(int[] nums) {
        Index[] memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;

        for (int i = nums.length - 2; i >= 0; i--) {
            int furthestJump = Math.min(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= furthestJump; j++) {
                if (memo[j] == Index.GOOD) {
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }

        return memo[0] == Index.GOOD;
    }

    public static void main(String [] args)
    {
        boolean a = Character.isDigit('9');
        int [] arr = {3,2,1,0,4};
        canJump(arr);
    }
}
