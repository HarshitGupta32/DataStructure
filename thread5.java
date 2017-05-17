import java.util.ArrayList;

/**
 * Created by hgupta on 3/11/2017.
 */
public class thread5 {
    private ArrayList<Integer> list1= new ArrayList<Integer>();
    private ArrayList<Integer> list2= new ArrayList<Integer>();

    public void add1(int list)
    {
        try{
            Thread.sleep(1);
        }
        catch(InterruptedException e)
        {

        }
            list1.add(list);

    }
    public void add2(int list)
    {
        try{
            Thread.sleep(1);
        }
        catch(InterruptedException e)
        {

        }

            list2.add(list);

    }

    public  void process(){

        for(int i=0;i<1000;i++)
        {
            add1(i);
            add2(i);
        }
    }

    public  void main(String [] args)
    {
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                process();
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                process();
            }
        });

        t1.start();
        t2.start();

        System.out.print(list1.size()  );
        System.out.print(list2.size()  );
        System.out.println( );
    }
}
