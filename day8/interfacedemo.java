public class interfacedemo {
    public static void main(String[] args) {
        Shape circle = new Circle(20); 
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        Shape rectangle = new Rectangle(10, 5); 
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape 
{
    int radius;

    public Circle(int radius) 
    {
        this.radius = radius;
    }
    public double area() 
    {
        return 3.14 * radius * radius;
    }
    public double perimeter() 
    {
        return 2 * 3.14 * radius;
    }
}

class Rectangle implements Shape 
{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() 
    {
        return length * breadth;
    }
    public double perimeter() 
    {
        return 2 * (length + breadth);
    }
}
