public class LockEx
{
    public static void main(String[] args) {
        Ques2 q2 = new Ques2(1234,433);
        Ques2 q3 = new Ques2(12345,344);
        new Thread(new Runnable() {
            @Override
            public void run() {
                q2.withdrawal(45);
                q3.deposit(1234);
            }
        }).start();
        new Thread(new Runnable () {

            @Override
            public void run() {
                q2.withdrawal(45);
                q3.deposit(4321);
            }
        }).start();
    }
}
