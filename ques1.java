public class ques1
{
    private static String firstname="Varun",lastname="Bhalla";
    private static int age=24;
    static
    {
        System.out.println("Static Block");
        System.out.println("Firstname"+ " "+firstname);
        System.out.println("lastname:"+" "+lastname);
        System.out.println("age:"+" "+age);
    }
    public static void Display()
    {
        System.out.println("Static Block");
        System.out.println("Firstname"+" "+firstname);
        System.out.println("lastname:"+" "+lastname);
        System.out.println("age:"+" "+age);
    }
    public static  void main(String[] args)
    {
        ques1 q= new ques1();
        q.Display();
    }
}
