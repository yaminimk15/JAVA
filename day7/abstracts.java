public class abstracts {
    public static void main(String[] args) {
        Manager obj = new Manager("yamini", 28, "grd123", 678900);
        obj.display();
    }
}

abstract class Persons {
    protected String name;
    protected int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

abstract class Employee extends Persons {
    protected String employed;
    protected int salary;

    public Employee(String name, int age, String employed, int salary) {
        super(name, age);
        this.employed = employed;
        this.salary = salary;
    }
}

class Manager extends Employee {
    public Manager(String name, int age, String employed, int salary) {
        super(name, age, employed, salary);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employed: " + employed);
        System.out.println("Salary: " + salary);
    }
}
