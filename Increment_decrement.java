import java.util.Scanner;

public class Increment_decrement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of i :");
        int i=sc.nextInt();
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);
        System.out.println(i--);
        System.out.println(--i);;
    }
}
