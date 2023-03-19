public class ques1
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        MyThread t1 = new MyThread();

        t.start();
        t1.start();

        //runnable
        MyRunnable r = new MyRunnable();
        Thread t2= new Thread(r);
        t2.start();

        //join
        try
        {
            t.join();
        }
        catch (Exception e)
        {
            System.out.println("The exception has been caught " + e);
        }
        for(int i=0; i<=5; i++)
        {
            System.out.println("main thread");
        }
    }
}
