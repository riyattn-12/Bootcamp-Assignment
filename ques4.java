import java.util.Random;
import java.util.concurrent.*;

public class ques4
{
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(()->{
            Random random = new Random();
            return random.nextInt(70);
        });
        Integer result = future.get();
        System.out.println(result);
        executor.shutdown();

    }

}
