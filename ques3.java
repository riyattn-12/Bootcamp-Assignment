import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ques3
{
    public static void main(String[] args)
    {
        //Sum all the numbers greater than 5 in the integer list using streams.
        List<Integer> al = Arrays.asList(1,3,5,8,9);
        //List<Integer>al1 =
                System.out.print(al.stream()
                        .filter((e)-> e >5)
                        .mapToInt(e->e)
                                .sum());



        //System.out.println(al1);





    }
}
