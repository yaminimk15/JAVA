public class heir {
    public static void main(String[] args) {
    
        Car car = new Car("Toyota", "Corolla", "4");
        car.display();
        Bike bike = new Bike("Honda", "CBR600", "Sport");
        bike.display();
    }
}

class Vehicle {
    String make;
    String model;
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    String numberOfDoors;
    public Car(String make, String model, String numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }
    public void display() {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    String type;
    public Bike(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }
    public void display()
    {
        System.out.println("Bike make: " + make);
        System.out.println("Bike model: " + model);
        System.out.println("Bike type: " + type);
    }
}