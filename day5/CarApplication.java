import java.util.Scanner;

public class CarApplication {

    static class Car {
        private final String make;
        private final String model;
        private final int year;
        private final double price;

        public Car(String make, String model, int year, double price) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Price: $" + price);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car make: ");
        String make = scanner.nextLine();
        
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        
        System.out.print("Enter car year: ");
        int year = scanner.nextInt();
        
        System.out.print("Enter car price: ");
        double price = scanner.nextDouble();
        
        Car car = new Car(make, model, year, price);
        
        System.out.println("\nCar Details:");
        car.displayDetails();
        
        scanner.close();
    }
}
