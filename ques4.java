import java.util.Arrays;
import java.util.List;

import java.util.*;
public class ques4
{
    //Q4. Write a program to showcase the use of optional class
    public static void main(String[] args)
    {
        List<Integer> al = Arrays.asList(1,2,3,4);
        int res=
                al.stream()
                .filter(e-> e >5)
                .map(e-> e * e)
                .findFirst()
                .hashCode();
        System.out.println(res);


    }
}
