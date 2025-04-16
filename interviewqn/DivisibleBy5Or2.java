import java.util.Scanner;
public class DivisibleBy5Or2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 != 0 && number % 2 != 0) {
            System.out.println(number + " is NOT divisible by 5 or 2.");
        } else {
            System.out.println(number + " is divisible by 5 or 2.");
        }

        scanner.close();
    }
}
