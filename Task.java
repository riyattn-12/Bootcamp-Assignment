public class Task implements Runnable
{
    private final int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
    try
    {
        System.out.println("starting time:"+id);
        Thread.sleep(1000);
        System.out.println("finished task:"+id);
    }
    catch(InterruptedException e)
    {
        System.out.println("Interrupted excpetion occured");
    }
    }
}
