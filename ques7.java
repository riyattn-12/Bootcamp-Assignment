import java.util.Arrays;
import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ques7
{
    //Convert an Optional type into Stream.
    //mapmul
    public static void main(String[] args)
    {

        List<Integer> al = Arrays.asList(1,2,3,4,4,5,6,7,8,9,10);
        al
                .stream()
                .filter(e-> e > 7).findFirst().stream()
                .mapMulti((number,consumer)-> IntStream.rangeClosed(1,8)
                .forEach(e->consumer.accept(e*number)))
                .forEach(System.out::println);





    }




}
