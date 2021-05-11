import java.util.Scanner;
public class q3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of box:");
        double l = sc.nextDouble();
        System.out.println("Enter the breadth of box:");
        double b = sc.nextDouble();
        System.out.println("Enter height of box:");
        double h = sc.nextDouble();

        double volume = l * b * h;

        System.out.println("Volume Of boxis:" + volume);

    }
}