import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        int pro = 1;
        int i;
        for(i=1;i<=num;i++)
        {
            pro*=i;

        }
        System.out.println("facorial "+ num + "  is " + pro );

    }
    
}