public class dynamic {
    public static void main(String[] args)
    {
        Myanimal obj = new Myanimal();
        obj.display();
        obj=new Mydog();

        obj.display();
        obj=new c();
        obj.display();   
    }
    
}
class Myanimal
{
    public  void display()
    {
        System.out.println("Animal make sound");
    }
}
class Mydog extends Myanimal
{
    public void display()
    {
        System.out.println("Dog barks");
    }
}
class c extends Mydog
{
    public  void display()
    {
        System.out.println("c");
    }
}
