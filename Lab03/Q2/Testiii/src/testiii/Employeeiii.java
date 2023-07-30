package testiii;
public class Employeeiii
{
    private String name;
    private float salary,bonus;
    
    public Employeeiii(String name,float salary,float bonus)
    {
        this.name=name;
        this.salary=salary;
        this.bonus=bonus;
    }    
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setSalary(float s)
    {
        salary=s;
    }
    public float getSalary()
    {
        return salary;
    }
    public float getBonus()
    {
        return bonus;
    }
    public float getBonusAmout()
    {
        return salary+bonus;
    }
}
