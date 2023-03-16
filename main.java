public class main
{
    int Add(int a, int b)
    {
        int c = a+b;
        return c;
    }
    int Substract(int a,int b)
    {
        int d= a-b;
        return d;

    }
    static int multiply(int a, int b)
    {
        int res = a*b;
        return res;

    }
    public static void main(String[] args)
    {
        methodInterface Multiply = main::multiply;
        System.out.println(Multiply.display(2,3));

        methodInterface Add = new main()::Add;
        System.out.println(Add.display(3,6));

        methodInterface Substract= new main()::Substract;
        System.out.println(Substract.display(9,5));

    }
}
