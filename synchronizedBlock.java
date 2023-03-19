
//synchronized block
class synchronizedBlock {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                int res = n * i;
                System.out.println(res);
            }
        }
    }
}
class myThread2 extends Thread
{
        Table t = new Table();

        public myThread2(Table t) {
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
            Table obj = new Table();//only one2(obj);
            myThread2 m1 = new myThread2(obj);
            myThread2 m2 = new myThread2(obj);


            m1.start();
            m2.start();
            // m1.start();



        }
    }


