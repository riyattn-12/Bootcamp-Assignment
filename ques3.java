import java.util.stream.IntStream;

public class ques3
{
    //Use rangeClosed to create a  Stream.
    public static void main(String[] args)
    {
        IntStream.range(1,5).forEach(e->System.out.println(e));


        //closed range
        IntStream.rangeClosed(1,5).forEach(e->System.out.println(e));
    }
}
