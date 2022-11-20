import java.util.Scanner;

public class Find_Grater_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number : ");
        int a= sc.nextInt();
        System.out.println("enter second number : ");
        int b= sc.nextInt();
       if (a>b)
        System.out.println("a is grater");
        else
        System.out.println(" b is greater");
    }
}
