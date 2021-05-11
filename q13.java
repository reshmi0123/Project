// Base Class 
class Coding { 
    
    // Constructor for class Coding 
    public Coding() 
    { 
        System.out.println("Coding"); 
    } 
} 
  
// Child Class inherit the Base 
// Class 
class JAVA extends Coding { 
    
    // Constructor for class JAVA 
    public JAVA() { System.out.println("JAVA"); } 
} 
  
// Main Class 
public class q13 { 
    
    public static void main(String[] args) 
    { 
        // Ceating obj for 
        // class JAVA 
        JAVA obj = new JAVA(); 
    } 
}