public class q1
{
   public static void main(String[] args) 
   {
      int number1 = Integer.parseInt(args[0]);
      int number2 = Integer.parseInt(args[1]);
      int number3 = Integer.parseInt(args[2]);   
      if(number1 > number2 && number1 > number3)
      {
         System.out.println(number1 + " is largest number.");
      }
      else if(number2 > number1 && number2 > number3)
      {
         System.out.println(number2 + " is largest number.");
      }
      else   
      {
         System.out.println(number3 + " is largest number.");
      }
   }
}