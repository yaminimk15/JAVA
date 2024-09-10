import java.util.Scanner;
public class Managing {

    static class Employee {
        String name;
        int id;
        double basicSalary;
        double allowances;

        public Employee(String name, int id, double basicSalary, double allowances) {
            this.name = name;
            this.id = id;
            this.basicSalary = basicSalary;
            this.allowances = allowances;
        }

        double calculateGrossSalary() {
            return basicSalary + allowances;
        }

        void displayDetails() {
            System.out.printf("Name: %s\n", name);
            System.out.printf("ID: %d\n", id);
            System.out.printf("Basic Salary: $%.2f\n", basicSalary);
            System.out.printf("Allowances: $%.2f\n", allowances);
            System.out.printf("Gross Salary: $%.2f\n", calculateGrossSalary());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 

        Employee[] employees = new Employee[numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            while (basicSalary < 0) {
                System.out.println("Basic Salary cannot be negative. Please enter a valid amount.");
                basicSalary = scanner.nextDouble();
            }

            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();
            while (allowances < 0) {
                System.out.println("Allowances cannot be negative. Please enter a valid amount.");
                allowances = scanner.nextDouble();
            }
            scanner.nextLine(); 

            employees[i] = new Employee(name, id, basicSalary, allowances);
        }

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nDetails of employee " + (i + 1) + ":");
            employees[i].displayDetails();
        }

        scanner.close();
    }
}
