/**
 * Created by hgupta on 3/11/2017.
 */

public class thread3 {
    public static void main(String [] args)
    {
        Thread runn = new Thread(new Runnable(){
            public void run()
            {
                for(int i =0;i<10;i++)
                {
                    System.out.println(i);
                    try{
                        Thread.sleep(100);
                    }
                    catch(InterruptedException e)
                    {

                    }
                }
            }
        });
        runn.start();
    }
}
