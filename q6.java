import java.util.Scanner;
    public class q6
    {
        public static void main(String args[])
        {
            int marks[] = new int[6];
            int i;
            float total=0, avg;
            Scanner scanner = new Scanner(System.in);
            
            
            for(i=0; i<5; i++) 
            { 
               System.out.print("Enter Marks of Subject "+(i+1)+": ");
               marks[i] = scanner.nextInt();
               total = total + marks[i];
            }
            avg = total/5;
            System.out.print("The student Grade is: ");
            if(avg>=90)
            {
                System.out.print("O");
            }
            else if(avg>=80 && avg<90)
            {
               System.out.print("E");
            } 
            else if(avg>=70 && avg<80)
            {
                System.out.print("A");
            }
            else if(avg>=60 && avg<70)
            {
                System.out.print("B");
            }
            else
            {
                System.out.print("C");
            }
        }
}
