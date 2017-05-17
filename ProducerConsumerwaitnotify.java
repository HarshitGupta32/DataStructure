import java.util.Scanner;

/**
 * Created by hgupta on 3/12/2017.
 */
public class ProducerConsumerwaitnotify {
    public void producer()
    {
        synchronized(this)
        {try
        {
            Thread.sleep(100);
            System.out.println("now producing");
            wait();
            System.out.println("no again producing");
        }

        catch(InterruptedException e)
        {

        }

        }
    }

    public void consumer()
    {
        Scanner scanner  = new Scanner(System.in);
        synchronized(this)
        {
try {
    Thread.sleep(1000);
    System.out.println("now consuming");
    scanner.nextLine();
    notify();
    Thread.sleep(5000);
}
catch(Exception e)
{

}




        }
    }


}
class app1
{
    public static void main(String [] args) throws InterruptedException
    {
        ProducerConsumerwaitnotify p = new ProducerConsumerwaitnotify();
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                p.producer();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                p.consumer();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
