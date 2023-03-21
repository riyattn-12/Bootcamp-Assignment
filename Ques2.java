import java.util.concurrent.locks.ReentrantLock;
import java.lang.*;
public class Ques2 {
    private float balance;
    public static ReentrantLock lock = new ReentrantLock();
    private int accountNumber;

    public Ques2(float balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void withdrawal(float amount)
    {
        lock.lock();

        try {
            if (balance < amount) {
                System.out.println("not enough balance");
                //return;
            } else {
                balance -= amount;
                System.out.println("withdrawal of amount" + amount + "is successfull. Balance is" + balance);
            }

        } finally {
            System.out.println("lock released" + Thread.currentThread().getName());
            lock.unlock();
        }
    }
    public  void deposit(float amount)
    {
        lock.lock();
        try
        {
            balance+= amount;
            System.out.println("balance is" +balance);
        }
        finally {
            System.out.println("lock released"+Thread.currentThread().getName());
        }
    }
}
