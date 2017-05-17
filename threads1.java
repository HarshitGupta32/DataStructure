/**
 * Created by hgupta on 3/11/2017.
 */
class runner extends Thread{

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(i);
        try{
            Thread.sleep(100000);
        }
        catch(InterruptedException e)
        {

        }}
    }
}
public class threads1 {


    public static void main(String [] args)
    {
        runner t1 = new runner();
        t1.start();
        runner t2 = new runner();
        t2.start();
    }
}

