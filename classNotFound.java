public class classNotFound
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("class not exists..");
        }
        catch (ClassNotFoundException e)
        {
            //e.printStackTrace();
            System.out.println("class not found.........");
        }
        try{
            throw new NoClassDefFoundError();
        }
        catch(NoClassDefFoundError e)
        {
            System.out.println("No class deFound error.....");
        }
        finally {
            System.out.println("class not found exception");
        }
    }
}
