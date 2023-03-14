sealed interface Shape permits Circle,Rectangle
{
    int Area();
}
record Circle() implements Shape
{

    @Override
    public int Area()
    {
        float r= 4.0F;
        return (int) (r*r);
    }
}
record Rectangle() implements Shape
{
    @Override
    public int Area()
    {
        int l = 4,b=8;
        return l*b;
    }
}


public class ques12
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        System.out.println(c.Area());

        Rectangle r = new Rectangle();
        System.out.println(r.Area());

    }
}
