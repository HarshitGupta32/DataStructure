import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by hgupta on 3/11/2017.
 */
public class Thread6 implements Runnable {

    private int id;

    public Thread6(int Id)
    {
        id = Id;
    }
    public void run()
    {
        System.out.println("starting"+id);
        System.out.println(id);
        try{
            Thread.sleep(10);
        }
        catch(Exception e)
        {

        }
        System.out.println("ending"+id);
    }
}

 class app{
    public static void main(String [] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for(int i = 0;i<5;i++)
        {
            executor.submit(new Thread6(i));
        }
        executor.shutdown();
try{
    executor.awaitTermination(1, TimeUnit.DAYS);
}
catch(InterruptedException e)
{

}

        System.out.println("All taks done");
    }

}
