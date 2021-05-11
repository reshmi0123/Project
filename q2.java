public class q2
{
   public static void main(String[] args) 
   {
       int a,s=0;
       for(int i=0;i<10;i++)
       {
           a = Integer.parseInt(args[i]);
           if(a%2==0)
           s++;
        }
        System.out.println(s+"Even nos");
        System.out.println(10-s+"ODD nos");
    }
}