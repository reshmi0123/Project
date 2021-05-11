public class q3iii {
	public static void main(String args[]) 
    { 
        String string1 = new String("Reshmi"); 
        String string2 = new String("Maity"); 
        String string3 = new String("KIIT"); 
        String string4 = new String("KIIT"); 
        String string5 = new String("kiit"); 
  
        
        System.out.println("Comparing " + string1 + " and " + string2 
                           + " : " + string1.equals(string2)); 
  
        
        System.out.println("Comparing " + string3 + " and " + string4 
                           + " : " + string3.equals(string4)); 
  
    
        System.out.println("Comparing " + string4 + " and " + string5 
                           + " : " + string4.equals(string5)); 
  
        
        System.out.println("Comparing " + string1 + " and " + string4 
                           + " : " + string1.equals(string4)); 
    } 
}
