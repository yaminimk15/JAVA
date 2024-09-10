public class absuper {
    public static void main(String[] args)
     
    {
        Child obj = new Child("Yamini");
        obj.display();
        
    }
    
}
class Parent
{
    String name;
    public Parent(String name)
    {
        this.name=name;
    }

}
class Child extends Parent
{

    String name;
    public  Child(String name)
    {
        super(name);
    }
    public void display()
    {
        System.out.println(name);
    }
}



