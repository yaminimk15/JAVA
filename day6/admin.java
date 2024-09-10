import java.util.Scanner;

public class admin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of student");
        int n=input.nextInt();
        Student[] obj=new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("name of the student");
            String name=input.next();
            System.out.println("id of the student");
            String id=input.next();
            obj[i]=new Student(name,id);
        }
        System.out.println("Enter a number of course");
        int num=input.nextInt();
        Course[] cr=new Course[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("name of the course");
            String coursename=input.next();
            System.out.println("id of the student");
            String courseid=input.next();
            cr[i]=new Course(coursename,courseid);
        }
        System.out.println("total student enrolled"+Student.displayStudent());
        System.out.println("total course offered"+Course.displayCourse());
    }
    
}
class Student
{
    String name;
    String id;
    static int totalstudent=0;
    public Student(String name,String id)
    {
        this.name=name;
        this.id=id;
        totalstudent++;
    }
    public static int displayStudent()
    {
        return totalstudent;
    }

}
class Course{
    String coursename;
    String courseid;
    static int totalcourse;
    public Course(String coursename, String courseid)
    {
        this.coursename=coursename;
        this.courseid=courseid;
        totalcourse++;

    }
    public static int displayCourse()
    {
        return totalcourse;
    }
    
}