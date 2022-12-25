package comparator;

import java.util.Comparator;
import java.util.TreeSet;

// WAP FOR CUSTOM CLASS WHOSE USING DEFAULT SORTING ORDER BY COMPARABLE &
//  USING CUSTOMIZED SORTING ORDER BY COMPARATOR

class Employee implements Comparable<Employee>
{

    private int id; 
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Employee o) {
        int eid1 = this.getId();
        int eid2 = o.getId();

        if (eid1 < eid2) {
            return -1;
        }
        else if(eid2 < eid1)
        {
            return 1;
        }
        else{
            return 0;
        }

    }

}

//WHO IS USING THAT CLASS IMPLEMENTS  ITS OWN SORTING TECHNIQUE BY COMPARATOR
public class Example4 implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
    

    public static void main(String[] args) {

        // USING DEFAULT SORTING ORDER WHICH WAS PROVIDED BY CLASS

        TreeSet<Employee> t1 = new TreeSet<>();

        t1.add(new Employee(103, "SHASHANK SHARMA"));
        t1.add(new Employee(105, "SHIVAM SALAME"));
        t1.add(new Employee(101, "SOMU SAXENA"));
        t1.add(new Employee(104, "VIVEK PATEL"));
        t1.add(new Employee(102, "AMUL SHARMA"));
        t1.add(new Employee(101, "SOMU SAXENA"));

        System.out.println("USING DEFAULT SORTING WHICH WAS PROVIDED BY CLASS");        
        System.out.println(t1);

        // USING CUSTOMIZED SORTING ORDER BY WHOSE USNIG THAT CLASS

        TreeSet<Employee> t2 = new TreeSet<>(new Example4());

        t2.add(new Employee(103, "SHASHANK SHARMA"));
        t2.add(new Employee(105, "SHIVAM SALAME"));
        t2.add(new Employee(101, "SOMU SAXENA"));
        t2.add(new Employee(104, "VIVEK PATEL"));
        t2.add(new Employee(102, "AMUL SHARMA"));
        t2.add(new Employee(101, "SOMU SAXENA"));
        
        System.out.println("USING CUSTOMIZED SORTING ORDER BY WHOSE USING THAT CLASS");

        System.out.println(t2);
    }

}

