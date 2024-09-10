import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the multiple table");
        int a = input.nextInt();
        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= a; j++) 
            {
                System.out.print(i*j+"  ");
            }
            System.out.println("");
         
        } 
            



    }
    
}
