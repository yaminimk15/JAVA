public class override {
    public static void main(String[] args) 
    {
        Dog obj=new Dog();
        obj.display();
        
    }
    
}
class Animal
{
    public void display()
    {
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal
{
    public void display()
    {
        System.out.println("Dog barks");
    }
}
