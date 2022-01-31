
package app;

import java.util.ArrayList;

public class Portfolio {
    
    private static int counter = 1000;
    
    private String firstName;
    private String lastName;
    private String id;
    
    ArrayList positions;
    
    public Portfolio(String firstName, String lastName, double cashAmount){
        positions = new ArrayList<>();
        
        this.firstName = firstName;
        this.lastName = lastName;
        
//Step 2.1   
       // Create and variable named "cash" of type Cash with input cashAmount
       // YOUR CODE HERE
        
        
        
        // add the cash object to the positions arraylist
        // YOUR CODE HERE
        
        // initalize the id with concatenating 
        // first two letters of the first name 
        // "-"
        // first two letters of the last name 
        // "-"
        // the current counter variable value
        
        // Example: Susan Smith
        // id = Su-SM-1000
        // YOUR CODE HERE
        
//end Step 2.1
        
        // add 1 to the counter value
        counter++;
                
    }
    
    
    
    
    public void displayInfo(){
        System.out.println("");
        System.out.println("==================================================");
        System.out.println("Portfolio Information");
        System.out.println("==================================================");
        System.out.printf("Name:\t %s, %s \n", firstName, lastName);
        System.out.printf("ID:\t %s \n", id);
        
    
        for(Object obj:positions){
            if(obj instanceof Cash){
                System.out.printf("Cash:\t %-10.2f \n", ((Cash) obj).getValue() );
            }//end if
        }//end for
        
    }
    
}//end class
