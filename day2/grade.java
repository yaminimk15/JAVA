import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("The student's grade is: " + grade);
        scanner.close();
    }
}
