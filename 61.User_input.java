import java.util.Scanner;
public class User_input {
    public static void main(String[] args){
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("You entered: "+num);
    }
}