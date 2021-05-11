public class q8 
{
    public static void main(String[] args) 
    {
        int limit = 57;
        
        System.out.println("Printing Even numbers between 23 and " + limit);
        
        for(int i=23; i <= limit; i++)
        {
        if( i % 2 == 0)
        {
            System.out.print(i + " , ");
        }
        }
    }
}
