import java.util.Scanner;
public class bmi{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter weight:");
        int w=scanner.nextInt();
        System.out.print("enter height in meter:");
        double h=scanner.nextDouble();
        double k=h*h;
        double t=w/k;
        if(t<18.5){
            System.out.println("BMI"+t);
            System.out.print("underweight");
        }
        else if(18.5<=t && t<24.9){
            System.out.println("BMI"+t);
            System.out.print("normal weight");
        }
        else if(25.0<=t && t<29.9){
            System.out.println("BMI"+t);
            System.out.print("normal weight");
        }
        else{
            System.out.println("BMI"+t);
            System.out.print("obesity");

        }          
        
    }
}