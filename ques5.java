import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class ques5
{
    public static void main(String[] args) throws InterruptedException
    {
        // WAP to showcase the difference between shutdown() and shutdownNow().
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for(int i=0; i < 4; i++)
        {
            executor.submit(new Task(i));
        }
        Thread.sleep(1000);
        executor.shutdown();
        System.out.println("called shutdown");
        while (!executor.isTerminated())
        {
            System.out.println("waiting for termintation");
            executor.awaitTermination(500,TimeUnit.MILLISECONDS);
        }
        executor= Executors.newFixedThreadPool(2);
        for(int i=1; i < 4; i++)
            executor.submit(new Task(i));
        Thread.sleep(10000);
        executor.shutdownNow();
        System.out.println("shutdownNow");
        while (!executor.isTerminated()){
            System.out.println("waiting for termination");

            executor.awaitTermination(500,TimeUnit.MILLISECONDS);
        }
        System.out.println("all tasks finished");
    }
}
