public class q3iv { 
    public static String insertString( 
        String originalString, 
        String stringToBeInserted, 
        int index) {  
        
        String newString = new String(); 
  
        for (int i = 0; i < originalString.length(); i++) {  
            
            newString += originalString.charAt(i); 
  
            if (i == index) {  
                
                newString += stringToBeInserted; 
            } 
        }  
        
        return newString; 
    }   
    
    public static void main(String[] args) {  
        
        String originalString = "Reshmi Maity"; 
        String stringToBeInserted = " Sarkar"; 
        int index = 5; 
  
        System.out.println("Original String: " + originalString); 
        System.out.println("String to be inserted: "+ stringToBeInserted); 
        System.out.println("String to be inserted at index: "+ index); 
  
        
        System.out.println("Modified String: " + insertString(originalString, stringToBeInserted,index)); 
    } 
}
 