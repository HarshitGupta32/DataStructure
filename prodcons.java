import java.util.LinkedList;
import java.util.Random;

/**
 * Created by hgupta on 3/14/2017.
 */
public class prodcons {

    LinkedList<Integer> list = new LinkedList<Integer>();
    int LIMIT = 10;
    Object lock = new Object();
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                //whenever the thread is notified starts again from the loop
                while (list.size() == LIMIT) {
                    lock.wait();// wait() is also true
                }
                list.add(value);

                System.out.println("Producer added: " + value + " queue size is " + list.size());
                value++;
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        Random random = new Random();
        while (true) {
            synchronized (lock) {
                while (list.size() == 0) {
                    lock.wait();
                }

                int value = list.removeFirst();
                System.out.print("Removed value by consumer is: " + value);
                System.out.println(" Now list size is: " + list.size());
                lock.notify();
            }
            Thread.sleep(random.nextInt(1000)); //force producer fill the queue to LIMIT_SIZE
        }
    }



    public static void main(String [] args) throws InterruptedException
    {
        prodcons c = new prodcons();
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                try{
                    c.produce();
                }
                catch(Exception e)
                {

                }

            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                try{
                    c.consume();
                }
                catch(Exception e)
                {

                }

            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
