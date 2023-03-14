import javax.swing.*;
import java.util.*;
public class ques5
{
    //Use ifPresentOrElse, or, orElseThrow Operations with Optional
    public static void main(String[] args)
    {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6,9,8);
        al
                .stream()
                .filter(e-> (e>7)).findFirst()
                .ifPresentOrElse(e->System.out.println(e), ()->System.out.println("value doesnt exists"));

    List<Integer> al1 = Arrays.asList(4,9,8,10);
            al1
                    .stream()
                    .filter(e-> e > 11).findFirst()
                    .or(()->Optional.of(-1)).ifPresentOrElse(System.out::println,
                            ()->System.out.println("this is for null"));

    }
}
