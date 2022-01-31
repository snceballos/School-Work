//=============================================================================
// Project Info Header
//=============================================================================
//=============================================================================
// PROGRAMMER:  Sophia Ceballos
// PANTHER ID:  6128838
//
// CLASS:       COP3337    
// SECTION:     U04 
// SEMESTER:    Spring 2021
// CLASSTIME:   Online
//
// ASSIGNMENT:  #1    
// DUE:         ENTER YOUR INFO 
//
//CERTIFICATION: I understand FIU’s academic policies, and I certify that this 
//               work is my own and that none of it is the work of any other person.
//                
//=============================================================================


package app;

import java.util.ArrayList;


public class Controller {

  
    public static void main(String[] args) {
       
// Step1        
       // Create a variable named "data" of type Data
       int 
      
  
        
       // used the data variable to call the displayInfo method
       // YOUR CODE HERE
       
       
//end Step 1
 
    //-------------------------------------------------------------------------
    
//Step 2
       // Create a variable named "portfolio" of type Portfolio
       // with the following inputs:
       // First Name = Susan
       // Last Name = Holiday
       // Cash Amount = 100000
       // YOUR CODE HERE
       
       
 //Step 2.3      
       // used the portfolio variable to call the displayInfo method
       // YOUR CODE HERE 
       
       
//end Step 2 - 2.3

    //-------------------------------------------------------------------------
    
//Step 3.1
        
        // Uncomment the header code below
        // header code
//            System.out.println("");
//            System.out.println("===========================================");
//            System.out.println("Data Stats");
//            System.out.println("===========================================");
        // end header code
        // use the Analyzer class to calculate the average of the data's 
        // SP500 values
        // Hint: think here a lot of stuff is going on here.....
        // COMPLETE THE CODE BELOW
        // System.out.printf("Average SP500: \t %-10.2f \n" YOUR CODE HERE
        
       
// end step 3.1

//Step 3.3
        // use the Analyzer class to calculate the variance  of the data's 
        // SP500 values
        // Hint: think here a lot of stuff is going on here.....
        // COMPLETE THE CODE BELOW
        // System.out.printf("Variance SP 500:  %-10.2f \n" YOUR CODE HERE

        
        
 //end step 3.3
 
//Step 3.5
        // use the Analyzer class to calculate the variance  of the data's 
        // SP500 values
        // Hint: think here a lot of stuff is going on here.....
        // COMPLETE THE CODE BELOW
        // System.out.printf("Std Dev SP 500: \t %-10.2f \n" YOUR CODE HERE  

        
        
        
 //end step 3.5
 
    //-------------------------------------------------------------------------
    
 // Step 4
        //Repeat steps 3.1, 3.3, 3.5 for data's Gold and Libor data
        // Hint: you may need to fix the alignment of the  output ... add or remove \t
        // YOUR CODE HERE
       
        
 // end Step 4        
 
    //-------------------------------------------------------------------------
    
// Step 5.1   

        // Uncomment the header code below
        // header code
//            System.out.println("");
//            System.out.println("===========================================");
//            System.out.println("Correlations Table");
//            System.out.println("===========================================");
//            System.out.println("\t SP500 \t Gold \t Libor");
        // end code header
   
        //  use the Analyzer class to calculate the correlation table shown in the instructions
        // IMPORTANT -> check your alignment of the output and the number of decimal places
        // I will be checking this
        // YOUR CODE HERE
        
   
 
 // end 5.1
 
    //-------------------------------------------------------------------------
    
    
 // Step 8
        
        // Uncomment the header code below
        // header code
//             System.out.println("");
//             System.out.println("==============================================");
//             System.out.println("Calibrate Multiplier ");
//             System.out.println("==============================================");
        //end of header code
        
        // create a variable named "multiplierSP500" of type double
        // that stores the return value of the calibrateMultiplier method with inputs
            //  dates = data.getDates()
            //  values = data.getSp500Data()
            //  lowCount = 45
            //  highCount = 50
            
        // YOUR CODE HERE
        
        // create a variable named "multiplierGold" of type double
        // that stores the return value of the calibrateMultiplier method with inputs
            //  dates = data.getDates()
            //  values = data.getGoldData()
            //  lowCount = 30
            //  highCount = 40
        
        // YOUR CODE HERE
        
        // create a variable named "multiplierLibor" of type double
        // that stores the return value of the calibrateMultiplier method with inputs
            //  dates = data.getDates()
            //  values = data.getLiborData()
            //  lowCount = 20
            //  highCount = 40
            
        // YOUR CODE HERE
        

      
      // print the multiplierSP500, multiplierGold and the multiplierLibor values
      // on the console. Match the alignment and decimal places of the values
      // as shown in the instructions
      // YOUR CODE HERE
      

      
// end Step 8

// Step 9 

      // Uncomment the header code below
      // header code
//        System.out.println("");
//        System.out.println("==============================================");
//        System.out.println("Trade Tricker ");
//        System.out.println("==============================================");
//        
//        double tolaranceSP500 = Analyzer.standardDeviation(data.getSp500Data()) * multiplierSP500;
//        double tolaranceGold = Analyzer.standardDeviation(data.getGoldData()) * multiplierGold;
//        double tolaranceLibor = Analyzer.standardDeviation(data.getLiborData()) * multiplierLibor;
     //end of header code
      
       // call the Analzer trade Tricker with input
       // data
       // tolaranceSP500
       // tolaranceGold
       // tolaranceLibor
       // YOUR CODE HERE

// end Step 9       
        
    }//end main
    
    
    public static double calibrateMultiplier(ArrayList<String> dates, ArrayList<Double> values, int lowCount, int highCount){
        
        double multiplier = 1.0;
        boolean finished = false;
        
        
 // Step 7
 
        // use a while loop and if statments to calibrate the multiplier variable so you find the number of
        // large data movements that are within the range of lowCount - highCount
        
        // if the current  multiplier value is to large -> your matches are less than the lowCount
        // reduce the multiplier size by %50
        
        // if you multiplier  is to small -> your matches are less than the lowCount
        // increase the multiplier size by %150
        
        // YOUR CODE HERE
        
   
        
 // end Step 7
 
        return multiplier;
        
        
    }
    
}//end class
