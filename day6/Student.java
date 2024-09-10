import java.util.Scanner;
public class Student {
    private int grade;
    public Student(int grade) 
    {
        this.grade=grade;
    }
    public void setGrade(int grade) 
    {
        if (grade >= 0 && grade <= 100) 
        {
            this.grade = grade;
        } else 
        {
            System.out.println("Error: Grade must be between 0 and 100.");
        }
    }
    public int getGrade() {
        return grade;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial grade (0-100): ");
        int a = input.nextInt();
        Student student = new Student(a);
        System.out.println("Initial grade: " + student.getGrade());
        System.out.print("Enter a new grade (0-100): ");
        int b = input.nextInt();
        student.setGrade(b);
        System.out.println("Updated grade: " + student.getGrade());
        System.out.println("final grade:"+student.getGrade());
    }
}

