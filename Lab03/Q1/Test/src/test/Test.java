package test;
public class Test {

   
    public static void main(String[] args)
    {
      Employee e=new Employee();
      e.setName("Anne");
      e.setAge(22);
      e.setSalary(120000);
      
        System.out.println("Employee name is "+e.getName());
        System.out.println("Age is "+e.getAge());
        System.out.println("Salary "+e.getSalary());
    }
    
}
