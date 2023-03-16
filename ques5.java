import com.sun.source.tree.BreakTree;

public class ques5
{
    //singleton pattern
    private  static ques5 instance;
    private ques5()
    {

    }
    public static synchronized  ques5 getInstance()
    {
        if(instance == null)
        {
            instance = new ques5();
        }
        return instance;

    }

public void makeCall(String number)
{
    System.out.println("callling:"+number);
}
public void sendText(String number,String)
}
