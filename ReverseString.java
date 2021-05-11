import java.util.*;
class ReverseString
{
  public static void main(String args[])
  {
    String original, reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    original=in.nextLine();
    char str[]=original.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(str[i]>='A' && str[i]<='Z')
            { 
            str[i]=(char)((int)str[i]+32);
            }
          }
          for(int i=0;i<str.length;i++)
        {
            if(str[i]>='a' && str[i]<='z')
            { 
            str[i]=(char)((int)str[i]-32);
            }
        }
    int length = original.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);

    System.out.println("Reverse of the string: " + reverse);
  }
}