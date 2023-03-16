import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        employee e = new employee("riya","Trainee",21);
        employee e4 = new employee("riya","Trainee",21);

        employee e1 = new employee("varun","Tech Lead",26);
        employee e2 = new employee("kunal","QE",24);
        employee e3 = new employee("aditi","SDET",28);
        HashMap<employee,Integer> hm = new HashMap<>();
        hm.put(e,36000);
        hm.put(e1,10000);
        hm.put(e2,30000);
        hm.put(e3,56000);
        hm.put(e4,66000);
        for(Map.Entry<employee,Integer> entry : hm.entrySet())
        {
            employee key= entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " : " + value);
        }







    }
}