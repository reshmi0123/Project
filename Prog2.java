import java.util.Scanner;
class Prog2
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        System.out.println(" enter string");
        String s1_1905575=sc.nextLine();
        StringBuffer newStr = new StringBuffer(s1_1905575);
    for (int i = 0; i < s1_1905575.length(); i++) {
      if (Character.isLowerCase(s1_1905575.charAt(i))) {
        newStr.setCharAt(i, Character.toUpperCase(s1_1905575.charAt(i)));
      } else if (Character.isUpperCase(s1_1905575.charAt(i))) {
        newStr.setCharAt(i, Character.toLowerCase(s1_1905575.charAt(i)));
      }
    }
    System.out.println(newStr);

    byte[] strAsByteArray = s1_1905575.getBytes();

    byte[] result = new byte[strAsByteArray.length];

    for (int i = 0; i < strAsByteArray.length; i++) result[i] =
      strAsByteArray[strAsByteArray.length - i - 1];

    System.out.println(new String(result));
     System.out.println(" enter string :");
    String s2_1905575=sc.nextLine();
    int t=s1_1905575.compareTo(s2_1905575);
    
     System.out.println("After compare :"+t);
     
     
     String s=s1_1905575+s2_1905575
    ;
    System.out.println("Merges :"+s);
    
    
    System.out.println("Sumit Sarkar");
 
    }
    
}