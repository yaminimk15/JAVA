import java.util.Scanner;

public class farm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int leg=sc.nextInt();
        int head=sc.nextInt();
        int rabbit=leg/2-head;
        int chicken=head-rabbit;
        if(rabbit<0 || chicken<0){
            System.out.println("Invalid");
        }else{
            System.out.println("Rabbits: "+rabbit + "Chickens: "+chicken);
        }
    }
}
