import java.io.*;
public class q8
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
 
        Cube c=new Cube();        
        Cuboid cd=new Cuboid();
        Sphere s=new Sphere();
 
        System.out.println("1. Cube");         
        System.out.println("2. Cuboid");
        System.out.println("3. Sphere");
 
        System.out.println("enter your choice:");     
        int a= Integer.parseInt(br.readLine());
 
        switch (a) 
        {                     
            case 1:
 
                System.out.println("Enter value for side:");
                Float side= Float.parseFloat(br.readLine());
 
                System.out.println("The volume of cube=" + c.volume(side));
                break;
 
            case 2:
                System.out.println("Enter value of length:");
                float length= Float.parseFloat(br.readLine());
 
                System.out.println("Enter value of breadth");
                Float breadth= Float.parseFloat(br.readLine());
 
                System.out.println("Enter value of height:");
                Float height= Float.parseFloat(br.readLine());
 
 
                System.out.println("volume of cuboid is=" + cd.volume(length,breadth,height));
                break;
 
 
            case 3:
 
                System.out.println("Enter value for radius:");
                Float radius= Float.parseFloat(br.readLine());
 
             
                System.out.println("The volume of Sphere=" + s.volume(radius));
                break;
 
            case 4:
                System.exit(0);
 
            default:
                System.out.println("Invalid Entry!");
        }
    }
}
 
class Cube
{
 
    public float volume(float side)     
    {
        return (side*side*side);
    }
}
 
class Cuboid
{
 
    public float volume(float length,float breadth,float height)
    {
        return (length*breadth*height );
    }
}

 
class Sphere
{

    public float volume(float radius)
    {
        return (4/3*22/7*radius*radius*radius );
    }
}
