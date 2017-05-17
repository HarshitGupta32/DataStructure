import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by hgupta on 3/11/2017.
 */
public class producerconsumer
{
private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

public static void producer()
{
    Random rnd = new Random();
    int i = 0;
    while(true)
    {
        try
        {
            queue.put(rnd.nextInt(100));
            System.out.println("put"+i);
            i++;
        }
        catch(InterruptedException e)
        {

        }

    }
}
public static void consumer()
{
    int i =0;
    while(true)
    {
        try{
            Thread.sleep(1000);
            System.out.println("take"+queue.take());
        }
        catch(InterruptedException e)
        {

        }
    }
}

public static void main(String [] args)
{
    Thread t1 = new Thread(new Runnable(){
        public void run(){
            try{
                Thread.sleep(100);
                producer();
            }
            catch(InterruptedException e)
            {

            }
        }
    });
    Thread t2 = new Thread(new Runnable(){
        public void run()
        {
            try{
                Thread.sleep(1000);
                consumer();
            }
            catch(InterruptedException e)
            {

            }
        }
    });
    t1.start();
    t2.start();
    try{
        t1.join();
        t2.join();
    }
    catch(InterruptedException e)
    {

    }
}
}


