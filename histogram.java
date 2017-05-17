import java.util.Stack;

/**
 * Created by hgupta on 4/16/2017.
 */
public class histogram {
    public static int maxarea(int [] arr)
    {
        int maxarea = 0;
        int maxarae_tillhere =0;
        Stack<Integer> st = new Stack<>();
        int i =0;
        while(i<arr.length)
        {
            if(st.isEmpty() || arr[i]>st.peek())
            {
                st.push(i);
                i++;
            }
            else
            {
                int top = st.pop();
                maxarae_tillhere = arr[top] * (st.isEmpty()?i:i-st.peek()-1);
                maxarea =  Math.max(maxarae_tillhere,maxarea);
            }
        }

        while(!st.isEmpty()){
            int top = st.pop();
            maxarae_tillhere = arr[top] * (st.isEmpty()?i:i-st.peek()-1);
            maxarea =  Math.max(maxarae_tillhere,maxarea);

        }


        return maxarea;
    }

    public static void main(String [] args)
    {
        int area = maxarea(new int [] {1,2,3,4,5,2,7,9,3});
    }
}
