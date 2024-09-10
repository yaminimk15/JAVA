import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the limit");
        int limit= input.nextInt();
        System.out.println("Enter the divisible number");
        int div=input.nextInt();
        for(int i=1;i<limit;i++)
        {
            if(i%div==0)
            {
                System.out.println("the first number divisible by " +div + " is "+ i);
                break;
        }
            }
            
    }
    
}