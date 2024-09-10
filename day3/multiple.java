import java.util.Scanner;


public class multiple{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Multiplication  Program!");
        
        while (true) {
            int num1 = (int) (Math.random() * 10) + 1;
            int num2 = (int) (Math.random() * 10) + 1;
            
            System.out.println("What is " + num1 + " * " + num2 + "?");
            System.out.print("Enter your answer:");
            
            int answer = scanner.nextInt();
            
            if (answer == 0) {
                break;
            }
            
            if (answer == num1 * num2) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer is " + (num1 * num2));
            }
        }
        
   }

}