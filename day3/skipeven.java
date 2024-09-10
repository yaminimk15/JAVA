import java.util.Scanner;
public class skipeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int a = input.nextInt();
        for (int i = 1; i <= a; i++)
         {
            if (i % 2 == 0) 
            {
                continue;
            }
            System.out.println(i);
         }
        


    }
    
}
