
import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = input.nextInt();
        int sums = 0;
        int i;
        for(i=0;i<=num;i++)
        {
            sums+=i;

        }
        System.out.println("sum of first "+ num + " natural number is " + sums);

    }
    
}
