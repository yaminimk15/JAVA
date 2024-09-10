import java.util.Scanner;
public class Grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();
        int[][] scores = new int[numOfStudents][2]; 
        System.out.println("Enter the scores:");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter Math and Science scores for Student " + (i + 1) + ": ");
            for (int j = 0; j < 2; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        Grades(scores);
        Averages(scores);
    }
    public static void Grades(int[][] scores) {
        System.out.println("Grades of all students:");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d: Math: %d, Science: %d%n", 
                              i + 1, scores[i][0], scores[i][1]);
        }
    }
    public static void Averages(int[][] scores) {
        int totalMath = 0;
        int totalScience = 0;
        int numberOfStudents = scores.length;

        for (int i = 0; i < numberOfStudents; i++) {
            totalMath += scores[i][0];
            totalScience += scores[i][1];
        }

        double averageMath = (double) totalMath / numberOfStudents;
        double averageScience = (double) totalScience / numberOfStudents;

        System.out.printf("Average Math grade: %.1f%n", averageMath);
        System.out.printf("Average Science grade: %.1f%n", averageScience);
    }
}
