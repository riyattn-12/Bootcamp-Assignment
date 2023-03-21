import java.util.concurrent.*;
public class ques1
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable runnable = ()->{
            System.out.println("this is runnable interface");
        };
        executor.execute(runnable);
        Callable<String> callable = ()-> {
            return "this is callable instance";
        };
        Future<String> future = executor.submit(callable);
        String result = future.get();
        System.out.println(result);
    }

}
