//==========================================================
// You do not need to do anything to this class
// but study it to see how it works.
//==========================================================

package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Data {
    
    private ArrayList<String> dates = new ArrayList<String>();
    private ArrayList<Double> sp500Data = new ArrayList<Double>();
    private ArrayList<Double> goldData = new ArrayList<Double>();
    private ArrayList<Double> liborData = new ArrayList<Double>();
            
            
    //----------------------------------------------------------
    public Data(){
        // The name of the file to open.
        // notice that the StockPrice_X_Data.txt is in the data package
        String fileName = "src/data/Project1-Data.txt";

        // This will reference one line at a time
        String line = null;
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =  new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
            
       
            
            
            int lineCounter = 1;        // line counter to know if I working header line
            String delims = "[,]";      // delimiter b/c data is a comma delimited file
            
            // go and get the content of the data
            // one line at a time until done
            while((line = bufferedReader.readLine()) != null) {

                // if I am not dealing with the file header line 1 go and do 
                if(lineCounter != 1){
                                   
                    //split the line by commas storage in the tokens[] the results
                    String[] tokens = line.split(delims);

                    // conert the token of type String into a wrapper type Double
                    // so I can store it in a Arraylist
                    dates.add(tokens[0]);
                    sp500Data.add(Double.parseDouble(tokens[1]));
                    goldData.add(Double.parseDouble(tokens[2]));
                    liborData.add(Double.parseDouble(tokens[3]));  
                } // end if
                
                // update the counter truly only need one time
                lineCounter++;
            }// end while   

            // Always close files.
            bufferedReader.close(); 

            
        // handle errors if they arise
        } catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        } catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }//end try

      
    }// end constructor
    //----------------------------------------------------------
    
    public ArrayList<String> getDates() {
        return dates;
    }
    //----------------------------------------------------------
    
    public ArrayList<Double> getSp500Data() {
        return sp500Data;
    }
    //----------------------------------------------------------
    
    public ArrayList<Double> getGoldData() {
        return goldData;
    }
    //----------------------------------------------------------
    
    public ArrayList<Double> getLiborData() {
        return liborData;
    }
    //----------------------------------------------------------
    
    public void dispayInfo(){
        
        System.out.println("==================================================");
        System.out.println("Data ");
        System.out.println("==================================================");
        System.out.printf("%-7s %-13s %-7s  %-8s %-10s \n", "Index",
                                                          "Dates",
                                                           "SP500",
                                                           "Gold",
                                                           "Libor");
        System.out.println("---------------------------------------------------");
        

        for(int i=0; i < dates.size(); i++){
            System.out.printf("%-7s %10s %10.2f  %7.2f %7.4f \n", i,
                                                                 dates.get(i),
                                                                 sp500Data.get(i),
                                                                 goldData.get(i),
                                                                 liborData.get(i));
            
        }//end for
    }
    
}//end class
