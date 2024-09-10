import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String password="password1234";
        String b= password;
        while(true)
        {
            System.out.println("Enter a password");
            String a=input.nextLine();
            if(a.equals(b))
            {
                System.out.println("password accepted");
                break;
            }
            else
            {
                System.out.println("Incorrect password\n");
            }
        }

    }
    
}
