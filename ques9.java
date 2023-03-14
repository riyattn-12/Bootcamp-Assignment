import java.util.*;
import java.util.stream.Collectors;

public class ques9
{
    public static void main(String[] args)
    {
        //Create Unmodifiable List from a Steam
        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> list=

        al
                .stream()
                .filter(e->(e % 2 == 0))
                .collect(Collectors.toUnmodifiableList());
        System.out.println(list);

    }
}
