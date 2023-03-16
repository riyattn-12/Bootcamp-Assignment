import java.util.HashMap;
import java.util.Objects;

public class employee
{
    private String name,designation;
    private int age;

    public employee(String name, String designation, int age)
    {
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getAge() {
        return age;
    }
    //to maintain uniqueness of object passed as key in hashmap, we override equal() and hashcode()
    @Override
    public boolean equals(Object obj)
    {
        employee emp = (employee) obj;
        return emp.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, designation, age);
    }




}
