import java.util.Scanner;
public class game{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the guessing game");
        System.out.println("I have selected a number 1 to 100");
        int num = (int) (Math.random() * 100) + 1;
        while(true){
            System.out.print("Enter your guess :");
            int n = input.nextInt();
            if(n>num){
                System.out.println("Too high");
            }
            else if(n==num){
                System.out.println("Correct !");
                break;
            }
            else if(n<num){
                System.out.println("Too low");
            }

        }
    }
}