import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ques3
{
    // 3) Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool()
    // to submit a list of tasks and wait for completion of all tasks.
    public static void main(String[] args) throws InterruptedException
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Runnable> tasks = Arrays.asList(
                () -> System.out.println("task 1"),
                () -> System.out.println("task 2"),
                () -> System.out.println("task 3")
        );
        ExecutorService single = Executors.newSingleThreadExecutor();
        ExecutorService cached = Executors.newCachedThreadPool();
        ExecutorService fixed = Executors.newFixedThreadPool(3);

        for(Runnable task: tasks) {
            single.submit(task);
            cached.submit(task);
            fixed.submit(task);
        }
        single.awaitTermination(100, TimeUnit.MILLISECONDS);
        cached.awaitTermination(100, TimeUnit.MILLISECONDS);
        fixed.awaitTermination(100, TimeUnit.MILLISECONDS);

        single.shutdown();
        cached.shutdown();
        fixed.shutdown();
    }
}
