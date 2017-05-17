/**
 * Created by hgupta on 3/18/2017.
 */
public class nextGreatestPerm {

        public static void nextPermutation(int[] nums) {

            if(!(nums.length == 1 && nums.length ==0)){
                int j = nums.length - 2;
                int comp = nums.length -1;
                int i =j;
                while(i>0)
                {
                    if(nums[i] > nums[comp] )
                    {

                            i--;
                    }

                    else
                        break;
                    if((i==0 && nums[0]>nums[comp]) && j>0)
                    {
                        j--;
                        i=j;
                        comp--;
                    }
                }


                if((nums[i]<nums[comp]))
                {
                    swap(nums,i,comp);
                }

            }

        }

        public static void swap(int [] arr, int i,int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String [] args)
        {
            int []  arr = {3,2,1};
            nextPermutation(arr);
        }
    }

