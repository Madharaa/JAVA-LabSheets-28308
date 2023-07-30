package test;
public class Test 
{

 
    public static void main(String[] args) 
    {
        Employee bogdan = new Employee();
        Employee bird = new Employee();
        
        bogdan.setEmpID(55);
        bogdan.setEmpName("Bogdan");
        bogdan.setEmpDesignation("electrical emgineer");
       
        bird.setEmpID(56);
        bird.setEmpName("Bird");
        bird.setEmpDesignation("mechanical emgineer");
       
        System.out.println("Mr. Bogdan details");
        System.out.println("Employee ID: "+bogdan.getEmpID());
        System.out.println("Employee Name: "+bogdan.getEmpName());
        System.out.println("Employee Designation: "+bogdan.getEmpDesignation());
        
        System.out.println("Mr. Boird details");
        System.out.println("Employee ID: "+bird.getEmpID());
        System.out.println("Employee Name: "+bird.getEmpName());
        System.out.println("Employee Designation: "+bird.getEmpDesignation());

    }
    
}
