public class exceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            int i=5;
            int j= i/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
            e.printStackTrace();
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Exception resolved...!!");
        }
    }
}
