import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("enter your mark");
        int a =input.nextInt();
        if(a>=90)
            System.err.println("Grage A");
        else if(a>=75)
            System.err.println("Grade B");
        else if(a>=55)
            System.err.println("Grade C");
        else 
            System.err.println("Fail");

    }
    
}