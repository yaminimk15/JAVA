import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();
        String result = (marks >= 50) ? "Passed" : "Failed";
        System.out.println("The student has " + result + ".");
        scanner.close();
    }
}
