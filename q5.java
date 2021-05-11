import java.util.Scanner;
public class q5 
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st Character:");
        char a = sc.next().charAt(0);

        System.out.println("Enter 2nd Character:");
        char b = sc.next().charAt(0);

        char item1=a;
        char item2=b;
        if (item1>item2)
            System.out.println(item2+" , "+item1);
       
        else
            System.out.println(item1+" , "+item2);
    }
}
