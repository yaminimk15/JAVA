class Person
{
    String name;
    int age;

}
class Employee extends Person
{
    String employeeId;
    String department;
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("EmployeeId:"+employeeId);
        System.out.println("Department:"+department);
    }
    
}

public class jobinfo {
    public static void main(String[] args)
    {
        Employee obj=new Employee();
        obj.name="anu";
        obj.age=20;
        obj.employeeId="A123";
        obj.department="HR";
        obj.display();
        

        
    }
    
}