import java.util.Scanner;
public class bank{
    public static void main(String[]args)
    {
       Scanner scanner=new Scanner(System.in);
       System.out.print("enter your current amount:");
       int a=scanner.nextInt();
       System.out.print("enter your withdrawal:");
       int b=scanner.nextInt();
       int c=a-b;
       if(c>0){
       System.out.println("withdrawal successfull.Newbalance:"+c+".00");}
       else{
       System.out.println("ERROR ");}
}
}       







