/**
 * Answer to TMA01 Question 1.
 * 
 * @author (Aaron Bruce Smith) 
 * @version (05 December 2018)
 */
public class RoomSafe
{
   // instance variables
   private String password;

   /**
    * Constructor for objects of class RoomSafe
    */
   public RoomSafe()
   {
      // instance variables
      password = "Admimadmin1";
  
   }
   
   public String getPassword() {
    
      return password;
   }
  
  public boolean isValidLength(String pw) {
     boolean result = false;
     
     if(pw.length() >= 8) {
        result = true;
      } else {
         result = false;
      }
      
      return result;
   }
   
/**
    * Given method
    * Return true if at least one of the characters in the argument
    * pw is a digit
    * otherwise return false
    */
   public boolean hasDigit(String pw)
   {    // Assume initially that the string contains no digits.
        boolean result = false;
        // Examine each character of pw in turn.
        for (int i = 0; i < pw.length(); i++)
        {
           // If the character at position i is a digit, 
           // set result to true
           if (Character.isDigit(pw.charAt(i)))
           {
             result = true;
           }
        }
        return result;
    }

public boolean hasUpperCase(String pw) {
   boolean result = false;
   
   for (int i=0; i < pw.length(); i++) {
      if (Character.isUpperCase(pw.charAt(i))) {
         result = true;
      } 
      
   }
   
    return result;
    
}

public boolean isValidPassword(String pw) {
   boolean result = false;
   
   if(isValidLength(pw) == true) {
      result = true;
   } 
   
   if(hasDigit(pw) != true){
      result = false;
   }
   
   if(hasUpperCase(pw) != true) {
      result = false;
   }
   
   return result;
  
}



public void setPassword(String pw) {
   this.password = pw;
   
   if(this.isValidPassword(pw) == true) {
      System.out.println("The password " + password + " is valid");
   } else {
      System.out.println("The password " + password + " is not valid");
   }
}


/** In regards to the hasChanged method, I noted that I should use the equals() method 
 * instead of == but I couldn't get the program to function correctly so I left the code 
 * as it is for now. A solution would be most welcome from you (if possible).
 */

public boolean hasChanged() {
   boolean result = false;
   
   if(this.getPassword().equals(password)) {
      
   }
   
   return result;
}

}
