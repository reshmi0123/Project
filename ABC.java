import java.io.*;


class ABC extends Super
{
  void show() throws ArrayIndexOutOfBoundsException
  { 
    System.out.println("child class"); 
  }

  public static void main(String[] args)
  {
    Super s = new ABC();
    s.show();
  }
}


class Super
{
  void show() { 
    System.out.println("parent class"); 
  }
}