package app;

import java.util.ArrayList;


public class Analyzer {
    
    public static double average(ArrayList<Double> data){
        double average = 0.0;
        
        double sum = 0.0;

// Step 3        
        // use an enhance for loop to add up at the elements of the arraylists
        // DO NOT USE A NORMAL FOR LOOP
        // YOUR CODE HERE
        
       
        // calculate the average value
        // YOUR CODE HERE
       
        
// end Step 3
        return average;
    }
    
    
    public static double variance(ArrayList<Double> data){
        
        // calculate the SAMPLE Variance
        // you need to divide by (n-1) not by n
      
        double average = average(data);
        double sum = 0.0;
        double variance = 0.0;
        
 // Step 3.2
        
        // calculate the sample variance using the formula given
        // in the instruction document
        // HINT: use the Math class
        // YOUR CODE HERE
        
        
// end Step 3.2        
        return variance;
    }
    
 // Step 3.4   
    public static double standardDeviation(ArrayList<Double> data){
        
        double stdDev = 0.0;
        // calculate the standard deviation using the formula given
        // in the instruction document
        // HINT: use the Math class
        // YOUR CODE HERE
        
       
        
    // end Step 3.4         
        return stdDev;
        
    }

    
    public static double correlation(ArrayList<Double> data1, ArrayList<Double> data2){
    
        double correlation = 0.0 ;
        double avgData1 = average(data1);
        double avgData2 = average(data2);
        
        double sum = 0.0;
        
        int index = 0;
        int numberOfPrices = data1.size();
 // Step 5   
         
         // write the code to calculate the correlation value between 
         // data1 and data2
         // you must code the formula that is shown in the instructions 
         // Hint: Be careful here ... make sure you understand the formula
         // YOUR CODE HERE
        

 // end Step5                   
       return correlation;
    
}
    
    
    
    public static int findLargeMovements(ArrayList<Double> data, double tolarance){
        
        int counter = 0;
 // Step 6       
        // Use a normal for loop  find large movements in the data that are bigger than
        // your tolarance. If you find a large movement increment the counter value by one
        // YOUR CODE HERE
        
       
 // end Step 6
 
        return counter;
    }
    
    
    
    public static void tradeTricker(Data data, 
                                   double tolaranceSP500, 
                                   double tolaranceGold, 
                                   double tolaranceLibor
                                   ){
        
        int counter = 0;
        
        ArrayList<Integer> sp500Matches = new ArrayList<>();
        ArrayList<Integer> goldMatches = new ArrayList<>();
        ArrayList<Integer> liborMatches = new ArrayList<>();
        
        
        for(int i=1; i< data.getDates().size(); i++){
            
            if(tolaranceSP500 <= (Math.abs( data.getSp500Data().get(i-1) - data.getSp500Data().get(i)  ))){
               sp500Matches.add(i);
               
            }
            
            if(tolaranceGold <= (Math.abs( data.getGoldData().get(i-1) - data.getGoldData().get(i)  ))){
               goldMatches.add(i);
            } 
            
            if(tolaranceLibor <= (Math.abs( data.getLiborData().get(i-1) - data.getLiborData().get(i)  ))){
               liborMatches.add(i);
            } 
        }//end for
        

        
        
        displayMatchInfo(sp500Matches, "SP500");
        displayMatchInfo(goldMatches, "Gold");
        displayMatchInfo(liborMatches, "Libor");
        
        displayTradeExecutions(data,sp500Matches,goldMatches,liborMatches);
        
        
       
    }
    
    private static void displayMatchInfo(ArrayList<Integer> matches, String header){
        System.out.println("===================================================");
        System.out.println(header);
        System.out.println("===================================================");
        System.out.printf("Number of matches: %d \n", matches.size());
        
        for(int i=0; i<matches.size(); i++){
            if(i < matches.size() -1){
                System.out.print(matches.get(i) +", ");
            }else{
                System.out.print(matches.get(i) +"\n");
            }
        }
        System.out.println("");
        
    }
    
    private static void displayTradeExecutions(Data data,
                                               ArrayList<Integer> sp500Matches,
                                               ArrayList<Integer> goldMatches,
                                               ArrayList<Integer> liborMatches){
        
        int counter = 0;
        
        System.out.println("===================================================");
        System.out.println("Trade Executions");
        System.out.println("===================================================");
        System.out.printf("%-5s \t %-10s \t %-10s \t %-10s \t %-10s \n", "Index", "Date", "SP500", "Gold", "Libor");
        
        
        for(int i = 0; i<sp500Matches.size(); i++){
            int index = sp500Matches.get(i);
    
            if(goldMatches.contains(index) && liborMatches.contains(index)){
                System.out.printf("%-5d \t %-10s\t %-10.2f \t %-10.2f \t %-10.2f \n", index,
                                                                               data.getDates().get(index), 
                                                                               data.getSp500Data().get(index),
                                                                               data.getGoldData().get(index),
                                                                               data.getLiborData().get(index)   );
                counter++;
            }//end if
        }//end for
        
        System.out.printf("Number of trade executions: %d \n", counter);
        
    
}
            
    
}//end class
