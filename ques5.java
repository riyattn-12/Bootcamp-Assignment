//Get list of all unique firstNames of
// employees where their salary is less than 5000 and who live in delhi.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class employee
{
    String fullname;
    long salary;
    String city;

    public employee(String fullname, long salary, String city)
    {
        this.fullname = fullname;
        this.salary = salary;
        this.city = city;
    }

    public String getFullname() {
        return fullname;
    }

    public long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}

public class ques5
{
    public static void main(String[] args)
    {
        List<employee> employee = Arrays.asList(
                new employee("riya",456,"delhi"),
                new employee("shreya",476,"delhi"),
                new employee("sumit",956,"bhopal"),
                new employee("himani",678,"delhi")


        );
        List<String> unique = employee.stream()
                .filter(e-> e.getSalary() < 5000 && e.city.equals("delhi"))
                .map(e-> e.getFullname().split("\\s+")[0])
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
    }
}
