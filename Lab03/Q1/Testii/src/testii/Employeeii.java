package testii;
public class Employeeii 
{
    private int age;
    private float salary;
    private String name;   
    
    public Employeeii(int age,float salary,String name)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public float getSalary()
    {
        return salary;
    }
}
