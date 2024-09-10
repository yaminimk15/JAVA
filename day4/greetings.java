import java.util.Scanner;
public class greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of student");
        int a =input.nextInt();
        String[]name=new String[a];
        System.out.println("Enter the name");
        for(int i=0;i<a;i++)
        {
            name [i]=input.next();
        }
        System.out.println("greeting");
        for(String value:name)
        {

            System.out.println(value+" good morning");
        }


    }
    
}
