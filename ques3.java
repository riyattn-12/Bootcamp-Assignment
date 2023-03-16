public class ques3
{
    //Ques 4: custom exception
    public static void chkAge(int age) throws ArithmeticException
    {
        if(age > 20)
        {
            System.out.println("access granted");
        }
        else {
            throw new ArithmeticException("throw new arithmetic exception");
        }

    }
    public static void main(String[] args)
    {
        try
        {
            chkAge(10);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("rest of the code");
        }
    }
}
