//synchronized method
class Table
{

    synchronized void printTable(int n)
    {
        for(int i=1; i<=10; i++)
        {
            int res= n*i;
            System.out.println(res);
        }
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class myThread1 extends Thread
{
    Table t = new Table();

    public myThread1(Table t) {
        this.t = t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class main
{


    public static void main(String[] args)
    {
        Table obj = new Table();//only one object
        myThread1 m = new myThread1(obj);
        myThread1 m1 = new myThread1(obj);
        m.start();
       // m1.start();



    }
}
