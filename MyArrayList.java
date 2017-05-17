import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hgupta on 3/12/2017.
 */
public class MyArrayList {
    private Object [] arr = new Object[10];
    private int size = 0;

    public int size()
    {
        return size;
    }

    public void resize()
    {
        arr = Arrays.copyOf(arr,size*2);
    }

    public void add(Object obj)
    {
        if(size> arr.length+5)
        {
            resize();
        }
        arr[size++] = obj;
    }

    public Object remove(int index)
    {
        if(index>size)
            throw new ArrayIndexOutOfBoundsException();

        Object temp = arr[index];

        reshuffle(index);
        return temp;
    }
    public void reshuffle(int index)
    {
        while (index<=size)
        {
            arr[index] = arr[index+1];
            index++;
        }


    }

    public Object get(int index)
    {
        if(index>size)
            throw new ArrayIndexOutOfBoundsException();
        else
            return arr[index];
    }

    public boolean contains(Object obj)
    {
        //if()
        for(int i = 0;i<size;i++)
        {
            //if(arr[])
        }
        return false;
    }


}
