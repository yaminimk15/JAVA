import java.util.Scanner;

public class grade {
    private String name;
    private double homeworkGrade;
    private double finalExamGrade;

    public grade(String name, double homeworkGrade, double finalExamGrade) {
        this.name = name;
        this.homeworkGrade = homeworkGrade;
        this.finalExamGrade = finalExamGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHomeworkGrade() {
        return homeworkGrade;
    }

    public void setHomeworkGrade(double homeworkGrade) {
        this.homeworkGrade = homeworkGrade;
    }

    public double getFinalExamGrade() {
        return finalExamGrade;
    }

    public void setFinalExamGrade(double finalExamGrade) {
        this.finalExamGrade = finalExamGrade;
    }

    public double getAverageGrade() {
        return (homeworkGrade + finalExamGrade) / 2.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = input.nextLine();
        
        System.out.print("Enter homework grade (0-100): ");
        double homeworkGrade = input.nextDouble();
        
        System.out.print("Enter final exam grade (0-100): ");
        double finalExamGrade = input.nextDouble();
        
        grade student = new grade(name, homeworkGrade, finalExamGrade);
        
        System.out.println("\nStudent Name: " + student.getName());
        System.out.println("Homework Grade: " + student.getHomeworkGrade());
        System.out.println("Final Exam Grade: " + student.getFinalExamGrade());
        
        double averageGrade = student.getAverageGrade();
        System.out.println("Average Grade: " + averageGrade);
        
        input.close();
    }
}

