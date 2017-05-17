/**
 * Created by hgupta on 3/11/2017.
 */
public class thread4 {
    private int var =0;
    private Object ob1 = new Object();

    public void inc()
    {
        synchronized (ob1)
        {
            var++;
        }

    }

    public void dowor()
    {
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                for(int i =0;i<10000;i++)
                    inc();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                for(int i =0;i<10000;i++)
                    inc();
            }
        });

        //Runnable t2 = () ->{for(int i = 0;i<10000;i++){
//        var++;
//        }
//        };

        t1.start();
       t2.start();

       try{
           t1.join();
           t2.join();
       }
       catch(InterruptedException e)
       {

       }
        System.out.println(var);
    }
    public static void main(String [] args)
    {
        thread4 up = new thread4();
        up.dowor();

    }
}
