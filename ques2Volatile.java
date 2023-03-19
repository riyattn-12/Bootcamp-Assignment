public class ques2Volatile
{

    public static volatile int count =0;

    public static void main(String[] args)
    {
        Thread t1 = new Thread( ()->{
            int localCount = count;
            while (localCount < 5)
            {
                if(localCount!= count)
                {
                    localCount = count;
                    System.out.println("count is changed" + localCount);
                }
            }
        });


        Thread t2= new Thread( ()->{
            int localcount =count;
            while(localcount <5)
            {
                System.out.println("thread 2 increments count to"+localcount);
                count= ++localcount;
            }
            try {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                System.out.println("exception occured");
            }
        });
       t1.start();
       t2.start();


    }
}
