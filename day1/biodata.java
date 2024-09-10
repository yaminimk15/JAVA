import java.util.Scanner;

public class biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Mark: ");
        float mark = scanner.nextFloat();
        
        System.out.print("Enter your Ph no: ");
        long number = scanner.nextLong();

        System.out.println("Student Bio Data:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
        System.out.println("Ph no:" + number);

    }
}