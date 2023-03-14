import java.util.stream.IntStream;

public class ques4
{
    //Use iterator stream method to generate a stream.
    public static void main(String[] args)
    {
        //imperative way
        for(int i=0; i <=10; i+=2)
        {
            System.out.println(i);
        }

        //iterators stream method
        IntStream
                .iterate(0, i-> i<=10 , i->i+2)
                .forEach(i->System.out.println(i));



    }

}
