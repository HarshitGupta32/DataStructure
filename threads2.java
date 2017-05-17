/**
 * Created by hgupta on 3/11/2017.
 */
class runner1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {

            }
        }
    }
}
public class threads2 {
    public static void main(String [] args)
    {
        Thread t1 = new Thread(new runner1());
        t1.start();
        Thread t2 = new Thread(new runner1());
        t2.start();
    }
}
