import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ques2
{
    //takeWhile and dropWhile
    public static void main(String[] args)
    {
        List<Integer> al = Arrays.asList(1,2,3,4,5,7,10);
        List<Integer> al1 =            //to maintain mutability
                al.stream()
                .takeWhile(e-> (e <= 5))
                //System.out.println(e);
                .collect(Collectors.toList());
                System.out.println(al1);


                //dropWhile
        List<Integer> list = Arrays.asList(4,4,4,5,7,9,10);
        List<Integer> list1=
                    list.stream()
                    .dropWhile(e-> (e <=4))
                    .collect(Collectors.toList());
                    System.out.println(list1);



    }
}
