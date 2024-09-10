import java.util.Scanner;

public class Employee {
    private String name;
    private int salary;
    public Employee(String name, int salary)
     {
        this.name = name;
        this.salary=salary; 
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary(int  salary) {
        if (salary >= 0) 
        {
            this.salary = salary;
        } else 
        {
            System.out.println("Error: Salary cannot be negative.");
        }
    }
    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String name = input.next();
        System.out.print("Enter the employee's salary: ");
        int salary = input.nextInt();
        Employee employee = new Employee(name, salary);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: $" + employee.getSalary());
        System.out.print("Enter a new name for the employee: ");
        String newName = input.next();
        employee.setName(newName);
        System.out.print("Enter a new salary for the employee: ");
        int newSalary = input.nextInt();
        employee.setSalary(newSalary);
        System.out.println("Updated Employee Name: " + employee.getName());
        System.out.println("Updated Employee Salary: $" + employee.getSalary());
    }
}

