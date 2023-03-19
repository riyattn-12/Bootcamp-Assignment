import java.lang.Thread;
public class MyRunnable implements Runnable
{

    @Override
    public void run()
    {
        for(int i=0; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName() + "  " +i);

        }
        //sleep
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
