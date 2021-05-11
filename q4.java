import java.util.Scanner;
public class q4 
{
        public static void main (String[] args)
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Character:");
            char a = sc.next().charAt(0);
            char b;
            if(Character.isLowerCase(a))
                b= Character.toUpperCase(a);
            else
                b= Character.toLowerCase(a);
            System.out.println(a+"->"+b);
           
        }
    
}
