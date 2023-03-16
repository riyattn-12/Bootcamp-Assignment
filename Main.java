

import question2.Employeee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class sortingSalary implements Comparator<Employeee>
{
    public int compare(Employeee e1,Employeee e2)
    {
                if(e1.getSalary() == e2.getSalary())
                {
                    return 0;
                }
                else if(e1.getSalary() > e2.getSalary())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        }
        public class Main
        {
            public static void main(String[] args)
            {
                ArrayList<Employeee> e=new ArrayList<>();
                e.add(new Employeee("Riya",22,200000));
                e.add(new Employeee("Shreya",26,100000));
                e.add(new Employeee("Devansh",25,300000));
                e.add(new Employeee("shobit ",29,345000));
                e.add(new Employeee("Richa",24,670000));

                Collections.sort(e,new sortingSalary());
                for(Employeee s:e)
                {
                    s.showInfo();
                }
            }
        }

