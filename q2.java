import java.util.*;
import java.lang.*;

class q2 
{
    public static void main(String[] args) 
    {
      
      for(int i=0;i<args.length;i++)  
      System.out.println(args[i]);  

      
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string 1 :");
        String str2= sc.nextLine();
        for(int i=0;i<args.length;i++)
        {
          String str3= (args[i]).concat(str2);

        System.out.println("Concated string : "+str3);

          String[] str_split = str3.split("\\s");
           for (int x=0; x<str_split.length; x++) 
           {
             System.out.println(str_split[x]);
           }
          }
    }
}   
